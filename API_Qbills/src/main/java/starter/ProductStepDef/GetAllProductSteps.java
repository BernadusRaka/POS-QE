package starter.ProductStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.serenitybdd.annotations.Steps;
import starter.Product.GetAllProduct;

public class GetAllProductSteps {
    @Steps
    GetAllProduct getAllProduct;

    @Given("Admin memasukkan endpoint untuk Get All Product")
    public void apiGetAllProduct() {
        getAllProduct.apiGetAllProduct();
    }

    @When("Admin send request untuk Get All Product")
    public void sendRequestGetAllProduct() {
        getAllProduct.sendRequestGetAllProduct();
    }

    @And("Semua data produk berhasil ditampilkan")
    public void allDataDisplayed() {
        getAllProduct.allDataDisplayed();
    }

    /*
    Get All Data Invalid
     */

    @When("Admin send request Get All product tanpa autentikasi")
    public void apiGetAllProductInvalid() {
        getAllProduct.apiGetAllProductInvalid();
    }

    @And("Admin gagal mendapat semua data produk")
    public void allProductNotDisplayed() {
        getAllProduct.allProductNotDisplayed();
    }
}
