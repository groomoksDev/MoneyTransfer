package services.bl;

public interface MoneyManager {
    boolean sendMoney(Long fromId, Long toId, Double sum);
    String getAccountMoneyInfo(Long accountId);
}
