package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class amazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanıcı amazon sayfasına gider")
    public void kullanıcı_amazon_sayfasına_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.bekle(2);
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();
    }

    @When("arama kutusunda iphone aratır")
    public void arama_kutusunda_iphone_aratır() {
        amazonPage.searchBox.sendKeys("iphone");
        amazonPage.searchBox.submit();
    }

    @When("sayfayı kapatır")
    public void sayfayı_kapatır() {
        ReusableMethods.bekle(2);
        Driver.closeDriver();
    }

    @When("arama kutusunda samsung aratır")
    public void arama_kutusunda_samsung_aratır() {
        amazonPage.searchBox.sendKeys("samsung");
        amazonPage.searchBox.submit();

    }


    @When("arama kutusunda nokia aratır")
    public void aramaKutusundaNokiaAratır() {
        amazonPage.searchBox.sendKeys("nokia");
        amazonPage.searchBox.submit();
    }

    @Given("kullanıcı {string} sayfasına gider")
    public void kullanıcıSayfasınaGider(String url) {
        Driver.getDriver().get(url);
    }

    @And("arama kutusunda {string} aratır")
    public void aramaKutusundaAratır(String aramaKutusunaYazilanBilgi) {
        amazonPage.searchBox.sendKeys(aramaKutusunaYazilanBilgi + Keys.ENTER);
    }
}
