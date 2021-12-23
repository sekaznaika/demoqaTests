package pages;

import appmanager.NavigationHelper;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final NavigationHelper navigationHelper = new NavigationHelper();

    public void goToElements() {
        $(By.cssSelector("div.card:nth-child(1)")).click();
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
