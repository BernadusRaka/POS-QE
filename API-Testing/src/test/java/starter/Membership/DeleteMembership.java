package starter.Membership;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.GenerateTokenAdmin;
import starter.utils.GenerateTokenSuperAdmin;
import starter.utils.JsonSchema;
import starter.utils.JsonSchemaHelper;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static starter.URL.urlMembership;

public class DeleteMembership {

    /*CasePositive*/
    @Step("User mengatur endpoint dengan ID yang valid untuk menghapus data membership")
    public String ApiEndDeleteMember(){return urlMembership;}

    @Step("User mengirimkan request untuk menghapus data")
    public void requestDeleteMembershipByID(){
        int lastMembershipID = GetterMembership.getMembershipByID();
        String token = GenerateTokenAdmin.generateTokenAdmin();
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .delete(urlMembership + lastMembershipID);
    }

    @Step("Pengguna mendapatkan pesan untuk membership yang sudah terhapus")
    public void deleteMembershipByID(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.DELETE_MEMBERSHIP_BY_ID_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body("'meta'.'success'", is(true)));
        restAssuredThat(response -> response.body("'meta'.'message'", is("succesfully delete data product type")));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }


    /*Negative Case*/

    @Step("User mengatur endpoint dengan invalid ID untuk menghapus data membership")
    public void requestDeleteMembershipInvalidID(){
        int lastMembershipID = GetterMembership.getMembershipByID();
        String token = GenerateTokenAdmin.generateTokenAdmin();
        SerenityRest.given()
                .header("Authorization", "Bearer " + token)
                .delete(urlMembership + lastMembershipID+0);
    }


}