package overload.challenge2;

public class AccountsReport {
    public void exhibitReport(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].getAccountStatus() +", "+ accounts[i].getDescription() +", "+ accounts[i].getExpirationDate());
        }
    }
}
