package test;

import org.testng.annotations.Test;

public class CheckBoxTest extends TestBase {

    @Test
    public void testCheckBox() {
        app.getMainPage().goToElements();
        app.getNavigationHelper().openCheckBoxTab();
        app.getCheckBoxPage().expandCheckBox();
        app.getCheckBoxPage().clickCheckBox();
    }
}
