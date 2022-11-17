package testselenide;

import com.codeborne.selenide.ElementsCollection;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class Tests {

    @Test
    public void firstSelenide() {
        open("https://www.google.com/");
        $(By.name("q")).setValue("Открытие").pressEnter();
        ElementsCollection resultSearch = $$x("//div[@class='g']");
        System.out.println(resultSearch);

    }
}
