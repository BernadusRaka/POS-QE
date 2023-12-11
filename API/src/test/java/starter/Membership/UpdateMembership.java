package starter.Membership;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;
import starter.utils.*;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static starter.URL.urlMembership;

public class UpdateMembership {

    @Step("User mengatur endpoint dengan valid untuk melakukan update data membership")
    public String ApiEndUpdateMembership(){return urlMembership;}

    @Step("User mengirimkan request untuk melakukan update data membership dengan data yang valid")
    public void requestUpdateMembership(){
        String token = GenerateTokenAdmin.generateTokenAdmin();
        JSONObject requestBody = new JSONObject();

        Faker faker = new Faker();
        String name = faker.name().name();
        String phoneNumber = faker.phoneNumber().phoneNumber();
        requestBody.put("Name", name);
        requestBody.put("PhoneNumber", phoneNumber);

        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .put(urlMembership + 1);
    }

    @Step("Sistem memberikan data membership yang telah di update sebagai respon")
    public void updateMembership(){
        JsonSchemaHelper helper = new JsonSchemaHelper();
        String schema = helper.getResponseSchema(JsonSchema.UPDATE_MEMBERSHIP_RESPONSE_SCHEMA);
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
    @Step("User mengirim request untuk update data membership tanpa mengisi data nama dan number phone")
    public void requestInvalidBodyUpdateMembership(){
        String token = GenerateTokenAdmin.generateTokenAdmin();

        JSONObject requestBody = new JSONObject();
        int lastMembershipID = GetterMembership.getLastMembershipID();

        requestBody.put("Name", " ");
        requestBody.put("PhoneNumber", " ");


        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .put(urlMembership + 1);
    }
    @Step("User mengirimkan request untuk melakukan update data membership dengan invalid ID")
    public void requestUpdateMembershipWithInvalidID(){
        JSONObject requestBody = new JSONObject();

        Faker faker = new Faker();
        String name = faker.name().name();
        String phoneNumber = faker.phoneNumber().phoneNumber();

        int lastMembershipID = GetterMembership.getLastMembershipID();

        requestBody.put("Name", name);
        requestBody.put("PhoneNumber", phoneNumber);

        String token = GenerateTokenAdmin.generateTokenAdmin();
        SerenityRest.given()
                .header("Content-Type","application/json")
                .header("Authorization", "Bearer " + token)
                .body(requestBody.toString())
                .put(urlMembership + 100);

    }
}