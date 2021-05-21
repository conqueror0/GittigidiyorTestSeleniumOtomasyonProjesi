import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class KartaUrunEklme extends BaseTest{
    Anasayfa anasayfa;
    UrunSayfasi urunSayfasi;
    UrunDetaySayfasi urunDetaySayfasi;
    CartPage cartPage;

    @Test
    @Order(1)
    public void urunAra(){
        anasayfa = new Anasayfa(driver);
        urunSayfasi = new UrunSayfasi(driver);
        anasayfa.aramaCubugu().search("bilgisayar");
        Assertions.assertTrue(urunSayfasi.urunSayfasiDOgrulama(),"urun anasayfa sayfasi acilmadi");

    }

    @Test
    @Order(2)
    public void urunSec(){
        urunDetaySayfasi = new UrunDetaySayfasi(driver);
        urunSayfasi.urunSec(1);
        Assertions.assertTrue(urunDetaySayfasi.urunDetaySayfasiDogrulama(),"urun detay sayfasi acik degil!");
    }

    @Test
    @Order(3)
    public void urunSepeteEkle(){
        urunDetaySayfasi.addToCart();
        Assertions.assertTrue(anasayfa.urunFiyatiDegistimi(),"ürun fiyati artmadi!");
    }

    @Test
    @Order(4)
    public void sepeteGit(){
        cartPage = new CartPage(driver);
        anasayfa.kartaGit();
        Assertions.assertTrue(cartPage.cartIfProductAdded(),"ürun sepete eklenmedi!");

    }

}
