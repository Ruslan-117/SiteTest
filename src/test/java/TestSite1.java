import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestSite1 {
    // Locators
    private final SelenideElement firstName = $("firstName");
    @BeforeAll
    static void setup(){
        Configuration.browser="firefox";
    }

    @Test
    void oPenPageTest(){
        open("https://demoqa.com/automation-practice-form");
    }
    void enterUsername(String username){
        // locators
        $(firstName).setValue(username);
    }
}
