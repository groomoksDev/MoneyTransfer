package services.dao;

import model.Account;

public interface MoneyOperation {
    void extractMoneyFromAccount(Long accountId, Double sum) throws Exception;
    void putMoneyToAccount(Long accountId, Double sum) throws Exception;
    Account getAccountInfo(Long aLong) throws Exception;
    boolean hasMoneyForSend(Long accountId, Double sum) throws Exception;
}
