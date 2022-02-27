import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepo {

    @Test
    void shouldSelenide() {
        open("https://github.com/");
        $("[data-test-selector ='nav-search-input']").setValue("Selenide").pressEnter();
        $$(".repo-list").first().$("a").click();
        $("h1").shouldHave(text("selenide / selenide"));


    }
}
