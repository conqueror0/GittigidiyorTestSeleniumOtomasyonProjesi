import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage{

    By productNameLocator = new By.ByCssSelector("seller-title");

    public CartPage(WebDriver driver){
        super(driver);
    }

    public boolean cartIfProductAdded() {
        return getProducts().size() >0;
    }

    private List<WebElement> getProducts(){
       return findAll(productNameLocator);
    }
}
