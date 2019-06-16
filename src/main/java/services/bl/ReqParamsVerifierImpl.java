package services.bl;

import controller.api.RoutingController;
import spark.Request;

import java.util.logging.Logger;

public class ReqParamsVerifierImpl implements ReqParamsVerifier {

    private static Logger logger = Logger.getLogger(RoutingController.class.getName());

    @Override
    public boolean verifyPatamsForSendMoney(Request request) {
        if (request.queryParams().size() !=3){
            return false;
        }
        return true;
    }

    @Override
    public boolean verifyPatamsForGetAccountMoneyInfo(Request request) {
        try {
            if (request.params().size() != 1) {
                return false;
            }
            Long.parseLong(request.params(":id"));
            return true;
        } catch (Exception ex){
            logger.info("Object is not Account Id");
            return false;
        }
    }
}
