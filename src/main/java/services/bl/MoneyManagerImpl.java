package services.bl;

import controller.api.RoutingController;
import model.Account;
import services.dao.MoneyOperation;
import services.dao.MoneyOperationImpl;

import java.util.logging.Logger;

public class MoneyManagerImpl implements MoneyManager {
    private static Logger logger = Logger.getLogger(RoutingController.class.getName());
    public MoneyManagerImpl(){

    }

    @Override
    public boolean sendMoney(Long fromId, Long toId, Double sum) {
        try{
            MoneyOperation operation = new MoneyOperationImpl();
            operation.extractMoneyFromAccount(fromId, sum);
            operation.putMoneyToAccount(toId, sum);
            return true;
        } catch (Exception ex){
            logger.info("Error send money operation");
            return false;
        }

    }

    @Override
    public String getAccountMoneyInfo(Long accountId) {
        try{
            MoneyOperation operation = new MoneyOperationImpl();
            Account account = operation.getAccountInfo(accountId);
            if(account == null){
                return "Account not found";
            } else {
                return String.valueOf(account.getSum());
            }
        } catch (Exception ex){
            logger.info("Error getting money info operation");
            return "Error getting money info operation";
        }

    }
}
