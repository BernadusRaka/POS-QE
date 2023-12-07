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

public class GetMembershipByPhone {
    @Step("User mengatur endpoint untuk meminta membership berdasarkan nomor telepon")
    public String ApiEndGetMembershipByPhone(){return urlMembership;}

    @Step("User mengirim request untuk mendapatkan data membership berdasarkan nomor telepon yang valid")
    public void requestGetMembershipByPhone(){
        int lastMembershipPhone = GetterMembership.getLastMembershipPhone();
        String token = GenerateTokenChasier.generateTokenChasier();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .get(urlMembership + "phone-number/" + lastMembershipPhone);
    }
    @Step("Data membership dengan nomor telepon yang diminta ditampilkan sebagai respon")
    public void getMembershipByPhone(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.GET_MEMBERSHIP_BY_PHONE_RESPONSE_SCHEMA);
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
    @Step("User mengirimkan request untuk mendapatkan data membership berdasarkan nomor telepon yang invalid")
    public void getMembershipByInvalidPhone(){
    int lastMembershipPhone = GetterMembership.getLastMembershipPhone();
    String token = GenerateTokenChasier.generateTokenChasier();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .get(urlMembership + "phone-number/" + lastMembershipPhone + "222222222");
}
}