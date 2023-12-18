package starter.ConvertPointStepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.ConvertPoint.CreateConvertPoint;

public class CreateConvertPointSteps {
    @Steps
    CreateConvertPoint createConvertPoint;

    @Given("Admin mengakses endpoint untuk membuat convert point dengan valid")
    public void apiCreateConvertPoint() {
        createConvertPoint.apiCreateConvertPoint();
    }

    @When("Admin send request untuk membuat convert point dengan valid")
    public void sendRequestConvertPoint() {
        createConvertPoint.sendRequestConvertPoint();
    }

    @And("Convert Point baru berhasil dibuat")
    public void convertPointCreated() {
        createConvertPoint.convertPointCreated();
    }

    /*
    Create Convert Point Valid
     */

    @Given("Admin akses dengan endpoint yang invalid untuk membuat convert point")
    public void invalidEndpointCreateConvertPoint() {
        createConvertPoint.invalidEndpointCreateConvertPoint();
    }

    @When("Admin send request untuk membuat convert point yang invalid")
    public void sendRequestInvalidCreateConvertPoint() {
        createConvertPoint.sendRequestInvalidCreateConvertPoint();
    }

    @And("Convert Point baru gagal dibuat")
    public void convertPointNotCreated() {
        createConvertPoint.convertPointNotCreated();
    }
}
