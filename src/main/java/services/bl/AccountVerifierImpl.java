package services.bl;

public class AccountVerifierImpl implements AccountVerifier {

    @Override
    public boolean hasMoneyForSend(Long accountId) {
        return true;
    }

}
