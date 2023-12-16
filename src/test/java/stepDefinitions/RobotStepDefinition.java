package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import pages.RobotPage;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.KeyEvent;

public class RobotStepDefinition {
    RobotPage robotPage = new RobotPage();
    @Test
    public void name() throws AWTException {
        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_WINDOWS); //windows tuşuna bastık
        robot.keyRelease(KeyEvent.VK_WINDOWS);//windows tusundan parmağımızı kaldırdık
        robot.delay(1000);

        robot.keyPress(KeyEvent.VK_N); //N tuşuna bastık
        robot.keyRelease(KeyEvent.VK_N);//N tusundan parmağımızı kaldırdık
        robot.delay(1000);

        robot.keyPress(KeyEvent.VK_0); //O tuşuna bastık
        robot.keyRelease(KeyEvent.VK_0);//O tusundan parmağımızı kaldırdık
        robot.delay(1000);


    }
    @When("yuklenmek istenen dosyayi yukler")
    public void yuklenmek_istenen_dosyayi_yukler() {
       robotPage.selectButton.click();
        ReusableMethods.uploadFilePath("\"C:\\Users\\ACER\\Downloads\\Batch189upload.pdf\"");
    }
    @Then("dosyanin basariyla yuklendigini test eder")
    public void dosyanin_basariyla_yuklendigini_test_eder() {

        Assert.assertTrue(robotPage.verify.isDisplayed());
    }
}
