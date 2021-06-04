package pages;


import com.codeborne.selenide.Condition;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.Locators;


import static com.codeborne.selenide.Selenide.*;

public class tv_Pages implements Locators {



    public void navigateToUrl() {
        open(urlTV);


    }

    public void filteringProducts() {
sleep(1000);

        $(firstFilter).selectOption(1);                           //selectOptionContainingText("Vodafone");
        sleep(200);
        $(firstFilter).selectOption(0);                     //selectOptionContainingText("Alle");

        sleep(500);

        $(preisORtarifFilter).selectOption(1);            //    selectOptionContainingText("< 20 Euro");


        {
            int sayac = 0;
            for (int i = 0; i < tabs.size(); i++) {

                String preisText = productPrice_out.get(i).text().trim().replaceAll("[*€]", "").substring(0, 2);
                System.out.println(preisText);

                int newPreis = Integer.parseInt(preisText);

                if (newPreis < 20) {
                    sayac++;

                }


            }
            int ppList = productPrice_out.size();
            System.out.println(sayac);
            Assert.assertEquals(sayac, ppList);
        }

        $(preisORtarifFilter).selectOption(2); //.selectOptionContainingText("20-30 Euro"); // sleep(1000);

        {
           int sayac = 0;
          for (int  i = 0; i< tabs.size(); i++) {

              String preisText = productPrice_out.get(i).text().trim().replaceAll("[*€]", "").substring(0, 2);
              System.out.println(preisText);
              sleep(1000);
                int newPreis = Integer.parseInt(preisText);

                if (newPreis >= 20 && newPreis < 30) {
                    sayac++;
                }


            }
            int ppList = productPrice_out.size();
            System.out.println(sayac);
            Assert.assertEquals(sayac, ppList);
        }


        $(preisORtarifFilter).selectOption(3); //selectOptionContainingText("30-40 Euro"); //sleep(1000);


        {
            int sayac = 0;
            for ( int i = 0; i < tabs.size(); i++) {

                String preisText = productPrice_out.get(i).text().trim().replaceAll("[*€]", "").substring(0, 2);
                System.out.println(preisText);
                int newPreis = Integer.parseInt(preisText);

                if (newPreis >= 30 && newPreis < 40) {
                    sayac++;
                }


            }
            int ppList = productPrice_out.size();
            System.out.println(sayac);
            Assert.assertEquals(sayac, ppList);
        }

        $(preisORtarifFilter).selectOption(4);

        {
            int sayac = 0;
            for ( int i = 0; i < tabs.size(); i++) {

                String preisText = productPrice_out.get(i).text().trim().replaceAll("[*€]", "").substring(0, 2);
                System.out.println(preisText);
                int newPreis = Integer.parseInt(preisText);

                if (newPreis >= 40) {
                    sayac++;
                }


            }
            int ppList = productPrice_out.size();
            System.out.println(sayac);
            Assert.assertEquals(sayac, ppList);

        }

        $(preisORtarifFilter).selectOption(0);



        sleep(1000);  $(sortierenFilter).selectOption(1); //shouldBe(Condition.exist).selectOptionContainingText("Bezeichnung");
        sleep(400);  $(sortierenFilter).selectOption(2); //shouldBe(Condition.exist).selectOptionContainingText("Neuste Tarife");
        sleep(400); $(sortierenFilter).selectOption(3); //shouldBe(Condition.exist).selectOptionContainingText("Alte Tarife");
        sleep(400);  $(sortierenFilter).selectOption(4); //shouldBe(Condition.exist).selectOptionContainingText("Mtl. Preis aufsteigend");
        sleep(400);   $(sortierenFilter).selectOption(5); //shouldBe(Condition.exist).selectOptionContainingText("Mtl. Preis absteigend");
        sleep(400); $(sortierenFilter).selectOption(0); //shouldBe(Condition.exist).selectOptionContainingText("Unsere Empfehlungen");
        sleep(200);
        $(firstFilter).selectOption(0);

    }




/*
    public void acceptCookies(){

        sleep(500);
        if ($(cookieDialog1).is(visible)) {
            $(cookieDialog1).$("button", 0).click();
            $(cookieDialog1).should(disappear);
        }
    }



    public boolean isMobileMode(){
        return $(responsiveMenuToggle).isDisplayed();
    }


    public boolean isMobileMenuOn(){
        return $(menuOverlay).is(appear);
    }



    public void openMenu(){
        if ($(menuOverlay).is(disappear))
            $(responsiveMenuToggle).click();
    }



    public void closeMenu(){
        if ($(menuOverlay).is(appear))
            $(mobileMenuClose).click();
    }


    public String getSiteLanguage(){
        String currentUrl = WebDriverRunner.url();
        String[] langArr = currentUrl.substring(currentUrl.indexOf(".de")+3).split("/");

        if (langArr.length < 2){
            return "DE";
        }else{
            String lang = langArr[1].trim().toUpperCase();
            if (!lang.equals("EN") && !lang.equals("TR"))
                lang = "DE";
            return lang;
        }
    }


    public String getMenuXPath(String text){
        return "//ul[@id='menu-ana-menu']//span[text()='" + text + "']";
    }



    public String getSubMenuOpener(String text){
        return getMenuXPath(text) + "//ancestor::li//span[@class='menu-toggle']";
    }



    public void navigateOnMenuTo(MenuLinks menuLinks){
        String langStr = getSiteLanguage();
        int lang = langStr.equals("EN") ? 1 : langStr.equals("TR") ? 2 : 0 ;
        if (isMobileMode())
            openMenu();

        if (menuLinks.isSubMenu()){
            SelenideElement mainLink;
            if (menuLinks.isLanguage())
                mainLink = $$(mainMenu).last();
            else
                mainLink = $x(getMenuXPath(menuLinks.getBaseMenu().getLang(lang)));

            if (isMobileMode()) {
                if (menuLinks.isLanguage())
                    $x(getSubMenuOpener(" " + langStr)).click();
                else
                    $x(getSubMenuOpener(menuLinks.getBaseMenu().getLang(lang))).click();
            }
            else
                mainLink.hover();
        }
        $x(getMenuXPath(menuLinks.getLang(lang))).click();
        acceptCookies();
    }

    public String getSubTitleOf(MenuLinks menuLinks){
        return SubMenuLinks.valueOf(menuLinks.toString()).getsubTitle(getSiteLanguage());
    }


    public void verifyEquality(String element1, String element2){
        Assert.assertEquals(element1, element2);
    }


    public void NotNull(String element){
        $(element).shouldNotBe(empty);
    } */
}
