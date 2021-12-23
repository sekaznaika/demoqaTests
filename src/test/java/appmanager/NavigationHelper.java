package appmanager;

import org.openqa.selenium.By;
import org.testng.log4testng.Logger;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class NavigationHelper {


    private static final Logger log = Logger.getLogger(NavigationHelper.class);


    ///////////////////////////////////////////////////
    // ELEMENTS //
    public void openTextBoxTab() {
        $(By.id("item-0")).click();
        $(By.className("main-header")).getText().equals("Text Box");
    }

    public void openCheckBoxTab() {
        $(By.id("item-1")).click();
       if (! $(By.className("main-header")).getText().equals("Text Box") ) {
           log.error("Это сообщение ошибки");
       }
    }

    public void openRadioButtonTab() {
        $(By.id("item-2")).click();
    }

    public void openWebTablesTab() {
        $(By.id("item-3")).click();
    }

    public void openButtonsTab() {
        $(By.id("item-4")).click();
    }

    public void openLinksTab() {
        $(By.id("item-5")).click();
    }

    public void openBrokenLinksTab() {
        $(By.id("item-6")).click();
    }

    public void openUploadTab() {
        $(By.id("item-7")).click();
    }

    public void openDynamicPropertiesTab() {
        $(By.id("item-8")).click();
    }
    /////////////////////////////////////////////////////////////////

    public String takeHeader() {
        String header = $(By.className("main-header")).getText();
        return header;
    }

    public void openMainPage() {
        open("https://demoqa.com/");
    }
}
