import static spark.Spark.*;

public class MoneyTransfer {
    public static void main(String[] args) {
        get("/sendMoney", (req, res) -> "Money was sended");
    }
}
