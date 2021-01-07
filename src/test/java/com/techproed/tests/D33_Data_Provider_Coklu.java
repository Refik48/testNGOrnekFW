package com.techproed.tests;

import com.techproed.pages.CkHotelsHomePage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class D33_Data_Provider_Coklu {
    //1.https://qa-environment.crystalkeyhotels.com/ sayfasina gidelim
    //2.Cucumber parametre ,cucumber scenario outline ve TestNg framework @Dataprovider kullanarak asagidaki gorevi tamamlayin
    //  - Login tusuna basin
    //  - Asagidaki 5 kullanici adi ve sifreyi deneyin ve login olmadigini test edin
    //  - Manager – Manager
    //  - Manager1- Manager1
    //  - Manager2 - Manager2
    //  - Manager3 - Manager3
    //   - Manager4 – Manager4




    @Test (dataProvider = "kullanicilar")
    public void test(String isim, String sifre){
        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        CkHotelsHomePage ckHotelsHomePage=new CkHotelsHomePage();
        ckHotelsHomePage.ilkLogIn.click();
        ckHotelsHomePage.userNameTextBox.sendKeys(isim);
        ckHotelsHomePage.passwordTextBox.sendKeys(sifre);
        ckHotelsHomePage.loginButonu.click();
        Assert.assertTrue(ckHotelsHomePage.girilemediYazisi.isDisplayed());
        Driver.closeDriver();

    }
  // array [4][2]
    @DataProvider(name="kullanicilar")
    public Object[][] kullaniciOlustur(){

     String datalar[][] ={{"Manager","Manager"},{"Manager1","Manager1"},{"Manager2","Manager2"},{"Manager3","Manager3"}};
     return datalar;
    }




}
