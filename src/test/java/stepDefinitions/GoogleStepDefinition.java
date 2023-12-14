package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

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

    @When("kulllanici verilen bilgiler arama yapar")
    public void kulllaniciVerilenBilgilerAramaYapar(DataTable data) {

        //data.asList();
        List<String> dataTableList = data.asList();
        for (int i = 0; i < dataTableList.size() ; i++) {
            googlePage.searchBox.sendKeys(dataTableList.get(i)+Keys.ENTER);
            googlePage.searchBox.clear();
        }


    }

    @When("kulllanici verilen bilgiler arama yapar ikinci yol")
    public void kulllaniciVerilenBilgilerAramaYaparIkinciYol(List<String>list) {

        for ( String w : list ) {
            googlePage.searchBox.sendKeys(w+Keys.ENTER);
            googlePage.searchBox.clear();
        }

    }
}
