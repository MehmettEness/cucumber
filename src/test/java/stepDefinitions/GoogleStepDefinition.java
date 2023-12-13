package stepDefinitions;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;
import utilities.ReusableMethods;

public class GoogleStepDefinition {
    GooglePage googlePage = new GooglePage();

    @When("google arama kutusunda {string} aratır")
    public void googleAramaKutusundaAratır(String aramaKutusunaYazılanBilgi) {
        googlePage.searchBox.sendKeys(aramaKutusunaYazılanBilgi , Keys.ENTER);
    }

    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String arac) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(arac));
    }

    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        ReusableMethods.bekle(saniye);
    }
}
