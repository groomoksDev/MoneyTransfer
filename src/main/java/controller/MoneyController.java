package controller;

import services.bl.AccountVerifier;
import services.bl.MoneyManager;


public class MoneyController {
    private AccountVerifier accountVerifier;
    private MoneyManager moneyManager;

    public MoneyController(AccountVerifier accountVerifier, MoneyManager moneyManager){
        this.accountVerifier = accountVerifier;
        this.moneyManager = moneyManager;
    }


    public boolean sendMoney(Long fromId, Long toId, Double sum){
        if (accountVerifier.hasMoneyForSend(fromId)){
            moneyManager.sendMoney(fromId, toId, sum);
            return true;
        } else {
            return false;
        }
    }

    public double getAccountMoneyInfo(Long accountId){
        return moneyManager.getAccountMoneyInfo(accountId);
    }

}
