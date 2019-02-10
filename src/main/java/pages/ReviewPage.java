package pages;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ReviewPage {

    @Step
    public ReviewPage openReviewPage(String url) {
        open(url);
        return this;
    }

    @Step
    public ReviewPage checkSomeText(String text) {
        $(".article-head__title").shouldHave(Condition.text(text));
        return this;
    }

}