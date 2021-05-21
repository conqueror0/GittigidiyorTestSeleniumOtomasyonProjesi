import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UrunSayfasi extends BasePage{

    By filterButtonOptLocater = By.id("filter-button-container"); //id
    By productnamelocator = new By.ByCssSelector("product-title"); //class

    public UrunSayfasi(WebDriver driver) {
        super(driver);
    }

    public boolean urunSayfasiDOgrulama() {
        return isDisplayed(filterButtonOptLocater);
    }

    public void urunSec(int i) {
        getAllProduct().get(i).click();
    }

    private List<WebElement> getAllProduct(){
        return findAll(productnamelocator);
    }
}
