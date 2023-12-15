package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty" ,  //bu konsolda ayrıntılı bilgi verir.
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" ,
                "rerun:TestOutput/failed_scenario.txt" },
// burada rerun ile fail olan senaryoları burada belirtmiş olduğumuz TestOutput dosyası oluştur ve  failed_scenario.txt dosyası içinde tutabiliriz.//hata verdiği yerin sırasını verir.
        features = "@TestOutput/failed_scenario.txt", //dosya yolunu verdik.txt dosyası veriyoruz. Bir dosya yolunu verirken başına @ koymak zorundayız
        glue = {"stepDefinitions", "hooks"} , //sadece bu kıısmı yazdık. hooks ismi oluşturduğumuz page den geliyor
        dryRun = false
)
public class FailedRunner13_Rerun {
}
/*
    Runner class bodysi icinde birsey yazilmaz
    Runner classinda önemli olan iki tane notasyon vardir
    1)@RunWith(Cucumber.class) ==>Runner classimiza calisma ozelligi verir
    2)@CucumberOptions ==> parantezi icinde hangi testleri calistiracağımızı, hangi raporlari
    alacağımızı, features ve glue parametrelerini ve diger test e dair ayrintilari ve cesitli
    plugin ekleyebiliriz
    dryRun = true => iken feature file daki test senaryolarini calistirmadan, eksik stepDefinition
    olup olmadigini kontrol eder, browseri acmaz
 */