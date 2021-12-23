package appmanager;

import org.checkerframework.checker.units.qual.C;
import org.testng.annotations.BeforeSuite;
import pages.CheckBoxPage;
import pages.ElementsPage;
import pages.MainPage;

public class ApplicationManager {
    private MainPage mainPage = new MainPage();
    private ElementsPage elementsPage = new ElementsPage();
    private NavigationHelper navigationHelper = new NavigationHelper();
    private CheckBoxPage checkBoxPage = new CheckBoxPage();

    @BeforeSuite(alwaysRun = true)
    public void init() throws Exception {
        System.setProperty("selenide.browser", "Firefox");
        navigationHelper.openMainPage();
    }


    public MainPage getMainPage() {
        return mainPage;
    }

    public ElementsPage getElementsPage() {
        return elementsPage;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public CheckBoxPage getCheckBoxPage() {return checkBoxPage;}
}
