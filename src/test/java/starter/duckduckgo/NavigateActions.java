package starter.duckduckgo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavigateActions extends PageObject {

    @Step("Navigate to DuckDuckGo")
    public void toTheDuckDuckGoSearchPage() {
        openUrl("https://html.duckduckgo.com/html/");
        WebElement searchBox = driver.findElement(By.cssSelector("input[name='q']"));
    }

    public boolean searchBoxIsVisible() {
        return $(By.cssSelector("input[name='q']")).isDisplayed();
    }
}