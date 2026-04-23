package starter.duckduckgo;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SearchActions extends PageObject {

    @Step("Search by keyword {0}")
    public void byKeyword(String keyword) {
        SelenideElement searchBox = $("input[name='q']");
    }
}