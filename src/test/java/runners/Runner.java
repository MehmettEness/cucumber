package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //run butonu getirir.
@CucumberOptions(
        //features page içerisindeki @glue içindeki stepDefinitions ile birleştir sonra tagı @US001 olanı çalıştır dedik
        plugin = {"html:target/default-cucumber-reports.html" ,
                    "json:target/json-reports/cucumber.json" ,
                    "junit:target/xml-report/cucumber.xml"} ,
        features = "src/test/resources/features/firstFeatureFile.feature" ,
        glue = "stepDefinitions" ,
        tags = "@US001" ,
        dryRun = false // bu true olursa eksik stepDefinitions varmı onu kontrol eder.

)
public class Runner {
}

/*
    Runner classin bodysi icinde birsey yazilmaz
    Runner classinda önemli olan iki tane notasyon vardir
    1)@RunWith ==>Runner clasimiza calisma özelligi getirdi
    2)@CucumberOptions ==> parantezi icinde hangi testleri calistiracağımızı,
                    hangi raporlari alacağımızı, features ve glue parametreleri ile bu dosyalarin pathlerini
                    gibi test ayrintilarini tanimlariz ve bazi pluginler ekleyebiliriz
      dryRun = true  ==> iken feature file daki test senaryolarini calistirmadan, eksik
      stepDefinition i olup olmadigini kontrol eder, browseri calistirmaz

 */