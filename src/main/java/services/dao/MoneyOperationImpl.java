package services.dao;

import model.Account;

public class MoneyOperationImpl implements MoneyOperation {
    @Override
    public void extractMoneyFromAccount(Long accountId, Double sum) throws Exception{
        TemporaryDataImpl.extractMoneyFromAccount(accountId, sum);
    }

    @Override
    public void putMoneyToAccount(Long accountId, Double sum) throws Exception {
        TemporaryDataImpl.putMoneyToAccount(accountId, sum);
    }

    @Override
    public Account getAccountInfo(Long accountId) throws Exception {
        return TemporaryDataImpl.getInfoAccount(accountId);
    }

    @Override
    public boolean hasMoneyForSend(Long accountId, Double sum) throws Exception {
        return TemporaryDataImpl.hasMoneyForSend(accountId, sum);
    }
}
