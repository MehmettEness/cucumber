package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
//before ve after methodlarını sağ tık yapıp oluşturduk.ancak yukarıdaki importu sildik ve before üstüne gelip cucmberdan cekmesini söyledik.
//Aynısı after method içinde geçerli
//Runner11_Hook çalaışltırdığımız önce ve sonra çalıştırdığımız gördük

public class Hook {
    @Before
    public void setUp() throws Exception {
        System.out.println("Hook clasındaki @Before methodu her test scenariodan önce çalışır");

    }
    @Before ("@honda")
    public void setUp2() throws Exception {
        System.out.println("sadece honda tagı olan senaryolardan önce çalıştırılır. Yani biz bu tagı US011de verdik ordan kontrol edilir.");

    }
    @After("@toyota")
    public void tearDown2() throws Exception {
        System.out.println("sadece @toyota tagi olan scenariolardan sonra calistirilir");
    }


    @After
    public void tearDown( Scenario scenario ) throws Exception {
        System.out.println("Hook clasındaki @After methodu her test scenariodan sonra çalışır");
        if (scenario.isFailed()) { //eger senaryo fail olursa
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver(); // bu objeyi zaten oluşturmuştuk
            scenario.attach(takesScreenshot.getScreenshotAs(OutputType.BYTES) , "image/png" , "scenario" + scenario.getName());
            Driver.closeDriver();
        }
    }
}
