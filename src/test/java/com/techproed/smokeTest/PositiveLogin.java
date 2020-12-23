package com.techproed.smokeTest;

import com.techproed.pages.CkHotelsHomePage;
import com.techproed.utilities.ConfigReader;
import com.techproed.utilities.Driver;
import org.testng.annotations.Test;

public class PositiveLogin {

    @Test
    public void pozitifSmokeTest(){
        CkHotelsHomePage ckHotelsHomePage=new CkHotelsHomePage();

        Driver.getDriver().get(ConfigReader.getProperty("ck_hotels_url"));
        ckHotelsHomePage.IlklogIn.click();
        ckHotelsHomePage.userNameTextBox.sendKeys(ConfigReader.getProperty("ck_hotels_user"));
        ckHotelsHomePage.passwordTextBox.sendKeys(ConfigReader.getProperty("ck_hotel_password"));
        ckHotelsHomePage.LoginButonu.click();



    }

}
