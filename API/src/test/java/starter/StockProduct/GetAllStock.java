package starter.StockProduct;

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
import static starter.URL.urlStockProduct;

public class GetAllStock {

    @Step("User mengatur endpoint yang valid untuk mendapatkan semua data stok produk")
    public String ApiEndGetAllStock(){return urlStockProduct;}

    @Step("User mengirim request untuk mendapatkan data")
    public void  requestGetAllStock(){}

    @Step("Respons berisi data seluruh stok produk muncul")
    public void getAllStocks(){}
}