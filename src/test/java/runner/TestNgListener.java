package runner;

import com.cs.framework.config.ConfigReader;
import com.cs.framework.config.Settings;
import com.cs.framework.utilities.LogUtil;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import java.io.IOException;

public class TestNgListener implements IInvokedMethodListener {
    @Override
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

        if (!iInvokedMethod.isTestMethod()) {
            //Initialize Config
            try {
                ConfigReader.PopulateSettings();
            } catch (IOException e) {
                e.printStackTrace();
            }

            //Logging
            Settings.Logs = new LogUtil();
            try {
                Settings.Logs.CreateLogFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Settings.Logs.Write("Framework Initialize");

            //Create Test Cycle for Reporting
//            Settings.ReportingConnection = DatabaseUtil.Open(Settings.ReportingConnectionString);
//            ReportingUtil.CreateTestCycle(Settings.ReportingConnection);

            Settings.Logs.Write("Test Cycle Created");

        }

    }

    @Override
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {

    }
}
