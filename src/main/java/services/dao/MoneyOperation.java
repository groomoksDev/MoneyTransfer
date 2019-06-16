package services.dao;

public interface MoneyOperation {
    void putMoneyToAccount(Long accountId) throws Exception;
    void extractMoneyFromAccoun(Long accountId) throws Exception;
    double getAccountMoneyInfo(Long aLong) throws Exception;
}
