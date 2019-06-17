package controller.api;

import controller.MoneyController;
import services.bl.AccountVerifierImpl;
import services.bl.MoneyManagerImpl;
import services.bl.ReqParamsVerifier;
import services.bl.ReqParamsVerifierImpl;

import java.util.logging.Logger;

import static spark.Spark.get;
import static spark.Spark.post;


public class RoutingController {
private static Logger logger = Logger.getLogger(RoutingController.class.getName());

    public RoutingController(){
    }

    public void ListenRouts(){
        MoneyController moneyController = new MoneyController(new AccountVerifierImpl(), new MoneyManagerImpl());
        ReqParamsVerifier reqParamsVerifier = new ReqParamsVerifierImpl();
        post("/sendMoney", (req, res) ->
        {
            if (reqParamsVerifier.verifyPatamsForSendMoney(req)) {
                return moneyController.sendMoney(Long.parseLong(req.queryParams("fromId")), Long.parseLong(req.queryParams("toId")),
                        Double.parseDouble(req.queryParams("sum")));
            } else {
                    logger.info("Error sending money");
                return "Error sending money";
            }
        });

        get("/getAccountMoneyInfo/:id", (req, res) -> {
            if (reqParamsVerifier.verifyPatamsForGetAccountMoneyInfo(req)) {
                return moneyController.getAccountMoneyInfo(Long.parseLong(req.params(":id")));
            } else {
                logger.info("Error getting money info");
                return "Error getting money info";
            }
        });
    }
}
