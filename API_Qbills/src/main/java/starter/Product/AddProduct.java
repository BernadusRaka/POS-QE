package starter.Product;

import com.github.javafaker.Faker;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import org.json.JSONObject;

import static starter.URL.urlAddProduct;

public class AddProduct {

    @Step("Admin mengakses endpoint untuk menambahkan produk")
    public String apiAddProduct() {
        return urlAddProduct;
    }

    @Step("Admin send request dengan method PUT untuk menambahkan produk")
    public void sendRequestAddProduct() {
        JSONObject requestBody = new JSONObject();

        Faker faker = new Faker();
        String
    }

    public void productAdded() {
    }

    public void noInformation() {
    }

    public void sendRequestAddProductInvalid() {
    }
}
