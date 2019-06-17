package services.dao;

import model.Account;

import java.util.ArrayList;
import java.util.List;

class TemporaryDataImpl {
    private static final List<Account> accounts = createAccounts();


    private static List<Account> createAccounts() {
        List<Account> accountsLst = new ArrayList<>();
        accountsLst.add(createAccount("Adam","Jons",1L,0.0));
        accountsLst.add(createAccount("Paula","Smith",2L,1000.0));
        accountsLst.add(createAccount("Fabio","Cannavaro",3L,2300.0));
        return accountsLst;
    }

    private static Account createAccount(String frstName,String lstName, Long id, Double sum) {
        Account account = new Account();
        account.setFisrtName(frstName);
        account.setLasName(lstName);
        account.setId(id);
        account.setSum(sum);
        return account;
    }

    static Account getInfoAccount(Long accountId) {
        return accounts.stream().filter(a->a.getId().equals(accountId)).findFirst().orElse(null);
    }

    static boolean hasMoneyForSend(Long accountId, Double sum) {
        Account account = getInfoAccount(accountId);
        return account.getSum() != 0.0 && account.getSum() >= sum;
    }

    static void extractMoneyFromAccount(Long accountId, Double sum){
        Account account = getInfoAccount(accountId);
        account.setSum(account.getSum()-sum);
    }

    static void putMoneyToAccount(Long accountId, Double sum){
        Account account = getInfoAccount(accountId);
        account.setSum(account.getSum()+sum);
    }
}
