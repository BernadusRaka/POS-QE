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

public class GetAllMembership {
    @Step("User mengatur endpoint yang valid untuk melihat seluruh data membership")
    public String ApiEndGetAllMembership(){return urlMembership;}

    @Step("User mengirimkan request untuk meminta seluruh data membership")
    public void requestGetAllMemberships(){
        int lastMembershipID = GetterMembership.getLastMembershipID();
        String token = GenerateTokenChasier.generateTokenChasier();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .get(urlCashier + lastMembershipID);
    }
    @Step("Seluruh data membership ditampilkan sebagai respon")
    public void getAllMemberships(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_MEMBERSHIP_RESPONSE_SCHEMA);
        restAssuredThat(response -> response.body("'meta'.'success'", is(true)));
        restAssuredThat(response -> response.body("'meta'.'message'", notNullValue()));
        restAssuredThat(response -> response.body("'total'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'id'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'chasierId'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'name'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'codeMember'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'point'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'phoneNumber'", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    /*Negative case*/
    @Step("User mengatur endpoint yang salah untuk meminta seluruh data membership")
    public void getAllMembershipsInvalidEndpoint() {
        // Define the invalid endpoint
        String invalidEndpoint = "https://qbills.biz.id/api/v1/member";

        // Mengatur base URL untuk RestAssured
        RestAssured.baseURI = invalidEndpoint;

        // Melakukan permintaan GET ke endpoint yang tidak valid
        int lastMembershipID = GetterMembership.getLastMembershipID();
        String token = GenerateTokenChasier.generateTokenChasier();

        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .get() // Adjust this part according to your API
                .then()
                .statusCode(404); // Adjust the expected status code as needed
    }

    @Step("Tidak ada data membership yang muncul")
    public void noMembershipsData(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_ALL_MEMBERSHIP_INVALID_ENDPOINT_RESPONSE_SCHEMA);
        restAssuredThat(response -> response.body("'message'", is("Not Found")));
        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));

    }



}