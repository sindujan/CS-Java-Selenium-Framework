package steps;

import com.cs.framework.base.DriverContext;
import com.cs.framework.base.FrameworkInitialize;
import com.cs.framework.config.Settings;
import com.cs.framework.utilities.ExcelUtil;
import com.cs.framework.utilities.ExtentReport;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


import java.io.IOException;

/**
 * Created by Karthik-pc on 02/10/2020.
 */
public class TestInitialize extends FrameworkInitialize {


    @Before
    public void Initialize(Scenario scenario) throws IOException {
            //Enter the scenario name
            ExtentReport.startScenario(scenario.getName());

            InitializeBrowser(Settings.BrowserType);
            Settings.Logs.Write("Browser Initialized");
            DriverContext.GoToUrl(Settings.AUT);
            Settings.Logs.Write("Navigated to URL " + Settings.AUT);

            try {
                ExcelUtil util = new ExcelUtil(Settings.ExcelSheetPath, Settings.SheetName);
            } catch (Exception e) {
            }
        

    }

    @After
    public void TearDown(){
        DriverContext.QuitDriver();

    }
}
