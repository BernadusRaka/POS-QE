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

public class GetMembershipByID {

    /*Positive*/
    @Step("User mengatur endpoint untuk mendapatkan data membership berdasarkan ID")
    public String ApiEndGetMemberByID(){return urlMembership;}

    @Step("User mengirim request untuk mendapatkan data membership berdasarkan ID yang valid")
    public void requestGetMembershipByID(){
        int lastMembershipID = GetterMembership.getLastMembershipID();
        String token = GenerateTokenChasier.generateTokenChasier();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .get(urlMembership + lastMembershipID);
    }
    @Step("Data membership dengan ID yang diminta ditampilkan sebagai respon")
    public void getMemberByID(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_MEMBERSHIP_BY_ID_RESPONSE_SCHEMA);
        restAssuredThat(response -> response.body("'meta'.'success'", is(true)));
        restAssuredThat(response -> response.body("'meta'.'message'", is("succesfully get data membership")));
        restAssuredThat(response -> response.body("'results'.'id'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'chasierId'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'name'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'codeMember'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'point'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'phoneNumber'", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }
    /*Negative*/
    @Step("User mengirimkan request untuk mendapatkan data membership berdasarkan ID yang tidak valid")
    public void requestGetMemberInvalidID(){
        int lastMembershipID = GetterMembership.getLastMembershipID();
        String token = GenerateTokenChasier.generateTokenChasier();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .get(urlCashier + lastMembershipID);

    }

}