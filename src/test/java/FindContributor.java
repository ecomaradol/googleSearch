import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class FindContributor {
    @Test
    void shouldFindContributorInfo() {
        open("https://github.com/selenide/selenide");

        $(".Layout-sidebar").$(withText("Contributors"))
                .closest(".BorderGrid-row").$("ul li").hover(); //search closest class/tag vverh po DOM and do hover (navedenie mouse)
        $$(".Popover-message").filterBy(visible).first().shouldHave(text("Andrei Solntsev")); //handle popup
                    //popup ne unikalniy na stranice, poetomu filtruem po visible and get first
    }
}
