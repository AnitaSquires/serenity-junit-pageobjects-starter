package starter.duckduckgo;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenSearchingByKeyword {

    @Managed(driver = "chrome", options = "headless")
    WebDriver driver;

    NavigateActions navigate;
    SearchActions search;

    @Test
    void should_open_the_home_page() {
        navigate.toTheDuckDuckGoSearchPage();
        Assertions.assertThat(navigate.searchBoxIsVisible()).isTrue();
    }

    @Test
    void should_search_by_keyword() {
        navigate.toTheDuckDuckGoSearchPage();
        search.byKeyword("Cucumber");

        Assertions.assertThat(driver.getCurrentUrl()).contains("q=Cucumber");
    }
}