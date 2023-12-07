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

public class RegisterMembership {
    @Step("User mengatur endpoint dengan valid untuk melakukan registrasi member")
    public String apiMemberRegister() {
        return urlMembership + "register";
    }

    @Step("User mengisikan data dengan lengkap dan valid")
    public void validRegisterMembership(){
        JSONObject requestBody = new JSONObject();
        Faker faker = new Faker();

        requestBody.put("Name", name);
        requestBody.put("PhoneNumber", phonenumber);

        String token = GenerateTokenChasier.generateTokenChasier();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(apiMemberRegister());
    }

    @Step("Data membership baru muncul sebagai respons")
    public void postRegisterMembership(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.REGISTER_MEMBERSHIP_RESPONSE_SCHEMA);

        restAssuredThat(response -> response.body("'meta'.'success'", is(true)));
        restAssuredThat(response -> response.body("'meta'.'message'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'id'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'chasierId'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'name'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'codeMember'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'point'", notNullValue()));
        restAssuredThat(response -> response.body("'results'.'phoneNumber'", notNullValue()));

        restAssuredThat(response -> response.body(matchesJsonSchema(schema)));
    }

    @Step("User tidak melakukan input data ID, name, telephone")
    public void invalidRegisterMembership(){
        JSONObject requestBody = new JSONObject();
        Faker faker = new Faker();

        requestBody.put("Name", " ");
        requestBody.put("PhoneNumber", " ");

    }
    @Step("User mengirimkan request untuk melakukan registrasi data membership")
    public void requestInvalidRegisterMembership(){
        String token = GenerateTokenChasier.generateTokenChasier();
        SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .post(apiMemberRegister());

    }
    @Step("User melakukan input data nomor telepon")
    public void postInvalidRegisterWithoutName(){
        JSONObject requestBody = new JSONObject();
        Faker faker = new Faker();

        requestBody.put("Name", " ");
        requestBody.put("PhoneNumber", phonenumber);
    }

    @Step("User melakukan input data nama")
    public void postInvalidRegisterWithoutPhoneNumber(){
        JSONObject requestBody = new JSONObject();
        Faker faker = new Faker();

        requestBody.put("Name", name );
    }



}