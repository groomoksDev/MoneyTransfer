package services.bl;

public interface MoneyManager {
    boolean sendMoney(Long fromId, Long toId, Double sum);
    double getAccountMoneyInfo(Long accountId);
}
