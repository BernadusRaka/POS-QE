package starter;

import net.serenitybdd.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class StatusCode {

    @Step("Muncul status code 201")
    public void receiveStatusCode201() {
        restAssuredThat(response -> response.statusCode(201));
    }

    @Step("Muncul status code 400")
    public void receiveStatusCode400() {
        restAssuredThat(response -> response.statusCode(400));
    }

    @Step("Muncul status code 204")
    public void receiveStatusCode204() {
        restAssuredThat(response -> response.statusCode(204));
    }

    @Step("Muncul status code 404")
    public void receiveStatusCode404() {
        restAssuredThat(response -> response.statusCode(404));
    }

    @Step("Muncul status code 200")
    public void receiveStatusCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("Muncul status code 401")
    public void receiveStatusCode401() {
        restAssuredThat(response -> response.statusCode(401));
    }
}
