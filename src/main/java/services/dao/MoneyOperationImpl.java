package services.dao;

import model.Account;

public class MoneyOperationImpl implements MoneyOperation {
    @Override
    public void putMoneyToAccount(Long accountId) throws Exception {

    }

    @Override
    public void extractMoneyFromAccoun(Long accountId) throws Exception{

    }

    @Override
    public double getAccountMoneyInfo(Long aLong) throws Exception {
        Account account = new Account();
        account.setSum(10.0);
        return account.getSum();
    }
}
