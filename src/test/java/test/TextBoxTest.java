package test;

import model.BoxesData;
import org.testng.annotations.Test;

public class TextBoxTest extends TestBase{

    @Test
    public void testFillTheBox() {
        app.getMainPage().goToElements();
        app.getNavigationHelper().openTextBoxTab();
        app.getElementsPage().fillTextBoxes(new BoxesData("User999", "Email999", "Adress999", "permanentAddress999"));
        app.getElementsPage().submitTextBox();
    }

}
