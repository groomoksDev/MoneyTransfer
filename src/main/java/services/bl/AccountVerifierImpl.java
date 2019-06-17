package services.bl;

import services.dao.MoneyOperation;
import services.dao.MoneyOperationImpl;

public class AccountVerifierImpl implements AccountVerifier {

    @Override
    public boolean hasMoneyForSend(Long accountId, Double sum) {
        try {
            MoneyOperation moneyOperation = new MoneyOperationImpl();
            return moneyOperation.hasMoneyForSend(accountId, sum);
        } catch (Exception ex){
            return false;
        }
    }

}
