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
import static starter.URL.urlMembership;
import static starter.URL.urlStockProduct;

public class DecreaseStock {
    @Step("User mengatur Endpoint yang valid dengan ID yang tersedia")
    public String ApiEndDecreaseStock(){return urlStockProduct;}

    @Step("User mengirimkan request untuk mengurangi jumlah stok produk")
    public void requestDecreaseStock(){

    }

    @Step("Muncul respon yang menampilkan jumlah stok yang berubah")
    public void responseDecreaseStock(){

    }
    @Step("User mengirimkan request untuk mengurangi jumlah stok produk tanpa mengisi body")
    public void requestDecreaseStockInvalid(){

    }
}