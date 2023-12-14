package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BlueRentalPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class BlueRentalStepDefinition {
    BlueRentalPage blueRentalPage = new BlueRentalPage();

    @Given("kullanici blueRentalCar sayfasina gider")
    public void kullaniciBlueRentalCarSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));


    }

    @When("login butonuna tiklar")
    public void loginButonunaTiklar() {
        blueRentalPage.loginButton.click();


    }

    @And("email ve password bilgileri ile login olur")
    public void emailVePasswordBilgileriIleLoginOlur() {
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("blueRentalEmail"));
        blueRentalPage.password.sendKeys(ConfigReader.getProperty("blueRentalPassword") , Keys.ENTER);

    }

    @And("kullanici {string} ve {string} bilgilerini girer")
    public void kullaniciVeBilgileriniGirer(String email , String password) {
        blueRentalPage.email.sendKeys(email);
        blueRentalPage.password.sendKeys(password , Keys.ENTER);
    }

    @Then("login olduğunu doğrular")
    public void loginOlduğunuDoğrular() {
        Assert.assertFalse(blueRentalPage.loginVerify.getText().equals("login"));
    }

    @And("verilen email ve password ile login olunur")
    public void verilenEmailVePasswordIleLoginOlunur(DataTable data) {

        List<List<String>>emailPassword = data.asLists();
 //i =1 vermemizin nedeni 0 degerinde suan email yazısı var. O yüzden 1 den başlarsak direk sa.walkerdan başlar
        for (int i = 1; i < emailPassword.size() ; i++) {
            String email = emailPassword.get(i).get(0); //sadece emaili verir
            String password = emailPassword.get(i).get(1); //sadece password verir

            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password, Keys.ENTER);
            ReusableMethods.bekle(3);
            Driver.getDriver().navigate().back();


        }


    }
}
