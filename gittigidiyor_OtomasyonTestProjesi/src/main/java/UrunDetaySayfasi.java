import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UrunDetaySayfasi extends BasePage{

    By addToBasketLocator = By.id("add-to-basket");

    public UrunDetaySayfasi(WebDriver driver) {
        super(driver);
    }

    public boolean urunDetaySayfasiDogrulama() {
        return isDisplayed(addToBasketLocator);
    }

    public void addToCart() {
        click(addToBasketLocator);
    }
}
