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
    public Account getAccountInfo(Long accountId) throws Exception {
        return TemporaryDataImpl.getInfoAccount(accountId);
    }
}
