package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckBoxPage {

    public void clickCheckBox() {
        $(By.cssSelector(".rct-icon-uncheck")).click();
    }

    public void expandCheckBox() {
        $(By.cssSelector(".rct-icon-expand-open")).click();
    }

    public void expandAll() {
        $(By.cssSelector(".rct-option-expand-all"));
    }

    public void collapseAll() {
        $(By.cssSelector(".rct-option-collapse-all"));
    }
}
