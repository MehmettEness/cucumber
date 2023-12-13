package stepDefinitions;

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

public class BlueRentalStepDefinition {
    BlueRentalPage blueRentalPage = new BlueRentalPage();

    @Given("Kullanici blueRentalCar sayfasina gider")
    public void kullaniciBlueRentalCarSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));


    }

    @When("Login butonuna tiklar")
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
}
