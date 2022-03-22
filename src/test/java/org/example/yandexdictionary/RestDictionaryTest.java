package org.example.yandexdictionary;

import io.restassured.RestAssured;
import org.example.yandexdictionary.EndPointUrl;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static java.net.HttpURLConnection.HTTP_OK;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.Matchers.equalTo;


public class RestDictionaryTest {

    //TODO 403. Надо разобраться

    private static final String URL_KEY = "https://translate.yandex.net/api/v1.5/tr.json";
    private static final String API_KEY = "trnsl.1.1.20180711T123306Z.b012f6b5034cc719.aff4999263480fef925a97d8863cbccc7ab40f50";

    @Test
    public void test() {
        RestAssured.baseURI = URL_KEY;
//        RestAssured.useRelaxedHTTPSValidation();

        given()
//                .header("User-Agent", "Firefox")
                .when()
                .get(EndPointUrl.TRANSLATE
                        .addPath(String.format("?key=%s&lang=%s&text=%s", API_KEY, "ru-en", "Привет, мир!")))
                .then()
                .statusCode(HTTP_OK)
                .body("text", hasItem("Hello world!"))
                .body("lang", equalTo("ru-en"))
                .body("code", equalTo(HTTP_OK));
    }
}
