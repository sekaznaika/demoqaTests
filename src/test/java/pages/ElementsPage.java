package pages;

import appmanager.NavigationHelper;
import org.openqa.selenium.By;
import model.BoxesData;

import static com.codeborne.selenide.Selenide.$;

public class ElementsPage {

    public void submitTextBox() {
        $(By.id("submit")).shouldBe().click();
    }

    public void fillTextBoxes(BoxesData boxesData) {
        typeUserName(By.id("userName"), boxesData.username());
        typeEmail(By.id("userEmail"), boxesData.email());
        typeAddress(By.id("currentAddress"), boxesData.address());
        typePadress(By.id("permanentAddress"), boxesData.pAdress());
    }

    private void typePadress(By locator, String text) {
        $(locator).setValue(text);
    }

    private void typeAddress(By locator, String text) {
        $(locator).setValue(text);
    }

    private void typeEmail(By locator, String text) {
        $(locator).setValue(text);
    }

    private void typeUserName(By locator, String text) {
        $(locator).setValue(text);
    }

}
