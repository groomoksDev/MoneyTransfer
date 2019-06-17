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


    public String sendMoney(Long fromId, Long toId, Double sum){
        if (accountVerifier.hasMoneyForSend(fromId, sum) && moneyManager.sendMoney(fromId, toId, sum)){
            return "Money send successful";
        } else {
            return "Not enough money";
        }
    }

    public String getAccountMoneyInfo(Long accountId){
        return moneyManager.getAccountMoneyInfo(accountId);
    }

}
