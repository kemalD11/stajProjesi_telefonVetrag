package stepDefinitions;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


import org.openqa.selenium.By;
import org.testng.Assert;
import pages.tv_Pages;
import utils.Locators;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class MyStepdefs extends tv_Pages implements Locators {
    @Given("^Navigate to Telefonvertrag home page$")
    public void navigateToTelefonvertragHomePage() {

        navigateToUrl();

sleep(2000);
        $(acceptCookies).shouldBe(visible).hover().click();


    }


    @Then("^user check Kabel page functionality$")
    public void userCheckKabelPageFunctionality()  {


        $(kabel_main).click();
        filteringProducts();


















            sleep(500);
            back();

        }


        }




