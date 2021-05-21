import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.Stack;

public class Anasayfa extends BasePage{

    aramaCubugu aramaCubugu;
    By cardCountLocator = new By.ByCssSelector("notify-user basket-item-count"); //class
    By cartContainerLocator = new By.ByCssSelector("basket-icon-container"); //class

    public Anasayfa(WebDriver driver) {
        super(driver);
        aramaCubugu = new aramaCubugu(driver);
    }

    public aramaCubugu aramaCubugu() {
        return this.aramaCubugu;
    }

    public boolean urunFiyatiDegistimi() {
        return getCartCount()>0;
    }

    public void kartaGit() {
        click(cartContainerLocator);
    }

    private int getCartCount(){
        String count = find(cardCountLocator).getText();
        return Integer.parseInt(count);
    }
}
