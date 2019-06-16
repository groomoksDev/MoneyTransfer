package services.bl;

import controller.api.RoutingController;
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
            operation.extractMoneyFromAccoun(fromId);
            operation.putMoneyToAccount(toId);
            return true;
        } catch (Exception ex){
            logger.info("Error send money operation");
            return false;
        }

    }

    @Override
    public double getAccountMoneyInfo(Long accountId) {
        try{
            MoneyOperation operation = new MoneyOperationImpl();
            operation.getAccountMoneyInfo(accountId);
            return 10.0;
        } catch (Exception ex){
            logger.info("Error getting money info operation");
            return -0.0;
        }

    }
}
