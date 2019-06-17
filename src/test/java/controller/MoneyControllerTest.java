package controller;

import org.junit.Assert;
import services.bl.AccountVerifier;
import services.bl.AccountVerifierImpl;
import services.bl.MoneyManager;
import services.bl.MoneyManagerImpl;

public class MoneyControllerTest {
    MoneyController moneyController;

    @org.junit.Test
    public void sendMoney_Params_True() {
        AccountVerifier accountVerifier = new AccountVerifierImpl();
        MoneyManager moneyManager = new MoneyManagerImpl();
        moneyController = new MoneyController(accountVerifier, moneyManager);
        Assert.assertTrue(moneyController.sendMoney(1L,2L,3.0));
    }

    @org.junit.Test
    public void getAccountMoneyInfo_Params_10() {
        AccountVerifier accountVerifier = new AccountVerifierImpl();
        MoneyManager moneyManager = new MoneyManagerImpl();
        moneyController = new MoneyController(accountVerifier, moneyManager);
        Assert.assertEquals("0.0", moneyController.getAccountMoneyInfo(1L), 0.0);
    }
}