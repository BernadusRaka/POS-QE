package starter.utils;

import io.restassured.response.ResponseBody;
import net.serenitybdd.rest.SerenityRest;
import org.json.JSONArray;
import org.json.JSONObject;

import static starter.URL.urlMembership;
import static starter.URL.urlProductType;

public class GetterMembership {
    public static int getLastMembershipID(){
        String tokenCashier = GenerateTokenCashier.generateTokenCashier();
        ResponseBody AdminResponse = SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + tokenCashier)
                .get(urlMembership);
        JSONObject productsResponseBody = new JSONObject(AdminResponse.asString());

        JSONArray cashierData = productsResponseBody.getJSONArray("results");

        JSONObject lastCashier = cashierData.getJSONObject(cashierData.length() - 1);
        return lastCashier.getInt("id");

    }

    public static int getLastMembershipPhone(){
        String tokenCashier = GenerateTokenCashier.generateTokenCashier();
        ResponseBody AdminResponse = SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + tokenCashier)
                .get(urlMembership);
        JSONObject productsResponseBody = new JSONObject(AdminResponse.asString());

        JSONArray cashierData = productsResponseBody.getJSONArray("results");

        JSONObject lastCashier = cashierData.getJSONObject(cashierData.length() - 1);
        return lastCashier.getInt("numberPhone");
    }
    public static int getLastMembershipName(){
        String tokenCashier = GenerateTokenCashier.generateTokenCashier();
        ResponseBody AdminResponse = SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + tokenCashier)
                .get(urlMembership);
        JSONObject productsResponseBody = new JSONObject(AdminResponse.asString());

        JSONArray cashierData = productsResponseBody.getJSONArray("results");

        JSONObject lastCashier = cashierData.getJSONObject(cashierData.length() - 1);
        return lastCashier.getInt("name");
    }
    public static int getLastMembership(){
        String tokenCashier = GenerateTokenCashier.generateTokenCashier();
        ResponseBody AdminResponse = SerenityRest.given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + tokenCashier)
                .get(urlMembership);
        JSONObject productsResponseBody = new JSONObject(AdminResponse.asString());

        JSONArray cashierData = productsResponseBody.getJSONArray("results");

        JSONObject lastCashier = cashierData.getJSONObject(cashierData.length() - 1);
        return lastCashier.getInt("numberPhone");
    }


}