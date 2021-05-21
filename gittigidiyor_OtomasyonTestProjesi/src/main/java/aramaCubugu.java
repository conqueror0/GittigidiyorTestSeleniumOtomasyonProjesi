import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class aramaCubugu extends BasePage {

    By aramaCubuguLocator = By.cssSelector("input[aria-label='Keşfetmeye Bak']"); //class
    By submitButtonLocator = By.cssSelector("input[class='qjixn8-0 sc-1bydi5r-0 hKfdXF']"); //class

    public aramaCubugu(WebDriver driver) {
        super(driver);
    }




    public void search(String text) {
        type(aramaCubuguLocator,text);
        click(submitButtonLocator);
    }

}
