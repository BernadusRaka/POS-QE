package starter;

import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

public class StatusCodeSteps {
    @Steps
    StatusCode statusCode;

    @Then("Muncul status code 200")
    public void statusCode200() {
        statusCode.receiveStatusCode200();
    }

    @Then("Muncul status code 201")
    public void statuCode201(){
        statusCode.receiveStatusCode201();
    }

    @Then("Muncul status code 204")
    public void statusCode204() {
        statusCode.receiveStatusCode204();
    }

    @Then("Muncul status code 400")
    public void statusCode400(){
        statusCode.receiveStatusCode400();
    }

    @Then("Muncul status code 401")
    public void statusCode401() {
        statusCode.receiveStatusCode401();
    }

    @Then("Muncul status code 404")
    public void statusCode404() {
        statusCode.receiveStatusCode404();
    }
}
