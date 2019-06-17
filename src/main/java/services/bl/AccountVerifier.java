package services.bl;

public interface AccountVerifier {
    boolean hasMoneyForSend(Long accountId, Double sum);
}
