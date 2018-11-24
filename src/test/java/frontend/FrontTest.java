package frontend;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Alvin\\IdeaProjects\\Memo\\src\\test\\java\\frontend\\FrontSteps.feature")
public class FrontTest {

    static ExtentReports report;
    static ExtentTest test;
    static String saveToPath = "C:\\Users\\Alvin\\IdeaProjects\\Memo\\src\\test\\java\\Report.html";

    @BeforeClass
    public static void setup(){
        report = new ExtentReports(saveToPath, true);
    }

    @AfterClass
    public static void tearDown(){
        report.flush();
    }

}
