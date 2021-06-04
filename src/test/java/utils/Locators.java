package utils;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public interface Locators {






    // url
    String urlTV = "https://telefonvertrag.de/";





    // Header and Footer Selectors
   By mainPage = By.xpath("//a[@title='Home Page']");
   By acceptCookies = By.xpath("//button[@aria-label='Akzeptiere alle']");
   By dontAcceptCookies = By.xpath("(//span[@class='cf1y60'])[2]");
    By kontaktSupport = By.xpath("//a[@title='Kontakt & Support']");
    By fragenAntworten = By.xpath("//a[@title='Fragen & Antworten']");
    By versandZahlung = By.xpath("//a[@title='Versand & Zahlung']");
    By bestellStatus = By.xpath("//a[@title='Bestellstatus']");
    By handyVersicherung = By.xpath("//a[@title='Handyversicherung']");
    By reparaturService = By.xpath("//a[@title='Reparatur & Service']");
    By newsletter = By.xpath("//a[@title='Newsletter']");
    By speedtest = By.xpath("//a[@title='Speedtest']");
    By blog_Service = By.xpath("(//a[@title='Blog'])[4]");
    By blog_socialMSection = By.xpath("(//a[@title='Blog'])[3]");
    By aGB = By.xpath("//a[@title='AGB']");
    By impressum = By.xpath("//a[@title='Impressum']");
    By datenschutz = By.xpath("//a[@title='Datenschutzt']");
    By widerrufFormular = By.xpath("//a[@title='Widerrufsbelehrung & Formular']");
    By cookieRichtlinien = By.xpath("//a[@title='Cookie Richtlinienseite']");
    By handyMitVertrag = By.xpath("//a[@title='Handy mit Vertrag']");
    By shoppingChart = By.xpath("//a[@title='Checkout']");
    By kabel_main = By.xpath("(//a[@title='Kabel'])[2]");
    By kabel_mainMobile = By.xpath("(//a[@title='Kabel'])[1]");
    By dsl_main = By.xpath("(//a[@title='DSL'])[2]");
    By dsl_mainMobile = By.xpath("(//a[@title='DSL'])[1]");
    By gigaTv_main = By.xpath("(//a[@title='GigaTV'])[2]");
    By gigaTv_mainMobile = By.xpath("(//a[@title='GigaTV'])[1]");
    By blog_main = By.xpath("(//a[@title='Blog'])[2]");
    By blog_mainMobile = By.xpath("(//a[@title='Blog'])[1]");
    By readMoreLess = By.xpath("//a[@class='more']");
    By firstFilter = By.xpath("(//select[@class='form-control'])[1]");
    By preisORtarifFilter = By.xpath("(//select[@class='form-control'])[2]");
    By sortierenFilter = By.xpath("(//select[@class='form-control'])[3]");

    By download_In1 = By.xpath("(//div[@class='elips']/h4)[1]");
    By download_In2 = By.cssSelector("tr:nth-child(2) > td:nth-child(2) > div");
    By upload_In1 = By.xpath("(//div[@class='elips']/h4)[2]");
    By upload_In2 = By.cssSelector("tr:nth-child(1) > td:nth-child(2) > div");

    By tarifNameTop_IN=By.xpath("//div[@class='breadcrumbs']/h1");
    By tarifNameMiddle_IN=By.xpath("(//div[@class='title'])[1]");
    By tarifNameBottom_IN=By.xpath("//h2[@class='in-page-hone-alle-zum-tarif']");


    By ppriceRealTop=By.xpath("(//div[@class='price']/text())[1]");
  //  By ppriceRealBottom= (By) $$(By.cssSelector("tr:nth-child(1) > td:nth-child(2)")).get(1);
    By ppriceFirst6Top=By.xpath("(//div[@class='price']/text())[2]");
    By ppriceFirst6Bottom=By.cssSelector(" tr:nth-child(3) > td:nth-child(2)");

    By pAnschlussPreis_In1=By.cssSelector(" tr:nth-child(5) > td:nth-child(2)");
    By pAnschlussPreis_In2=By.xpath("//ul[@class='small-details']/li[2]/text()[2]");






    ElementsCollection productName_out = $$(By.xpath("//div[@class='plan_box tarife-name']"));
    ElementsCollection productDownload_out = $$(By.xpath("//div[@class='dsl-tarif-info']/div[1]"));
    ElementsCollection productUpload_out = $$(By.xpath("//div[@class='dsl-tarif-info']/div[2]"));
    ElementsCollection productPrice_out = $$(By.xpath("//a[@class='plan_box_price_once_btn']/div"));
    ElementsCollection abDem7Monate = $$(By.xpath("//div[@class='values']/span[1]"));
    ElementsCollection anschlussPreis = $$(By.xpath("//div[@class='values']/span[2]"));
    ElementsCollection prdctsLinks = $$(By.xpath("//a[@class='plan_box_price_once_btn']"));
    ElementsCollection tabs = $$(By.xpath("//div[@class='product-margin col-md-6 col-lg-4']"));
   // ElementsCollection bottomTable = $$(By.cssSelector("tr:nth-child(1) > td:nth-child(2)")).get(1);


}
