package services.bl;

import spark.Request;

public interface ReqParamsVerifier {
    boolean verifyPatamsForSendMoney(Request request);
    boolean verifyPatamsForGetAccountMoneyInfo(Request request);
}
