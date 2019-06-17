package services.dao;

import model.Account;

public interface MoneyOperation {
    void putMoneyToAccount(Long accountId) throws Exception;
    void extractMoneyFromAccoun(Long accountId) throws Exception;
    Account getAccountInfo(Long aLong) throws Exception;
}
