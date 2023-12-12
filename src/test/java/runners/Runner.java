package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //run butonu getirir.
@CucumberOptions(
        //features page içerisindeki @glue içindeki stepDefinitions ile birleştir sonra tagı @US001 olanı çalıştır dedik
        features = "src/test/resources/features/firstFeatureFile.feature" ,
        glue = "stepDefinitions" ,
        tags = "@US001" ,
        dryRun = false // bu true olursa eksik stepDefinitions varmı onu kontrol eder.

)
public class Runner {
}
