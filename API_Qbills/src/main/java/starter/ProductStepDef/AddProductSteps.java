package starter.ProductStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.Product.AddProduct;

public class AddProductSteps {

    @Steps
    AddProduct addProduct;

    @Given("Admin mengakses endpoint untuk menambahkan produk")
    public void apiAddProduct() {
        addProduct.apiAddProduct();
    }

    @When("Admin send request dengan method PUT untuk menambahkan produk")
    public void sendRequestAddProduct(){
        addProduct.sendRequestAddProduct();
    }

    @And("Produk berhasil ditambahkan")
    public void productAdded() {
        addProduct.productAdded();
    }
/*
Case Negatif

 */
    @When("Admin memasukkan informasi yang tidak lengkap")
    public void noInformation() {
        addProduct.noInformation();
    }

    @Then("Admin send request dengan method PUT untuk menambahkan produk")
    public void sendRequestAddProductInvalid(){
        addProduct.sendRequestAddProductInvalid();
    }

}
