package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ReviewPage;

import static com.codeborne.selenide.Configuration.baseUrl;

@Feature("All test scenarios")
public class AndooTests {

    @BeforeMethod(alwaysRun = true)
    public void setBrowser() {
        baseUrl = "https://javarush.ru";
    }

    @Test
    @Story("Мой тест с Allure")
    public void exampleTest() {
        new ReviewPage()
                .openReviewPage("/about/reviews")
                .checkSomeText("Отзывы");
    }

}