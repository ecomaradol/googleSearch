import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class SoftAssertionPage {

    @Test
    void shouldExistCodeExample () {

        open("https://github.com/");
        $(byXpath("//input[@data-test-selector = 'nav-search-input']")).setValue("Selenide").pressEnter();
        $$(".repo-list").first().$("a").click();
        $("h1").shouldHave(text("selenide / selenide"));
        $("#wiki-tab").click();
        $(byXpath("//a[contains(text(),'Soft assertions')]")).shouldHave(text("Soft assertions")).click();
        $(byXpath("//ol[@start = '3']/li")).shouldHave(text("Using JUnit5 extend test class:"));

    }
}
