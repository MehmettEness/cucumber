package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    public void searcbox(){

    }
    /*
     PageFactory.initElements(Driver.getDriver(),this); kodu bu classtaki class memberlari webdriver ile eslestirir
     Bu sayede classtaki webelementlere erismek icin PageFactory e yardimci olan  @FindBy notasyonu kullanilabilir
     */

    public GooglePage() { //sağ tık constructor seç

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy (id="APjFqb")
    public WebElement searchBox;


}
