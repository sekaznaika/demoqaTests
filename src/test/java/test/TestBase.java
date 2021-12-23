package test;

import appmanager.ApplicationManager;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    public final ApplicationManager app = new ApplicationManager();

    @BeforeSuite(alwaysRun = true)
    public void setUp() throws Exception {
        app.init();
    }

}
