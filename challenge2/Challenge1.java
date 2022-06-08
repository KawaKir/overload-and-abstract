package overload.challenge2;

public class Challenge1 {
    public static void main(String[] args) {

        Server constructionTeam = new Server();
        constructionTeam.setName("Malphas' Construction Co.");
        Server market = new Server();
        market.setName("Paimon's Traders");


        Client wholesale = new Client();
        wholesale.setName("Sharp Edge Butchery and Market");
        Client telecom = new Client();
        telecom.setName("Heaven's Signal Telecoms");

        AccountPay accountPay1 = new AccountPay();
        accountPay1.setAccountStatus(AccountStatus.DUE);
        accountPay1.setDescription("Due rent");
        accountPay1.setPrice(1230d);
        accountPay1.setExpirationDate("10/05/2012");
        accountPay1.setServer(constructionTeam);
        AccountPay accountPay2 = new AccountPay( AccountStatus.DUE , market, "Monthly groceries", 390d, "19/05/2012");


        AccountPay accountReceive1 = new AccountPay();
        accountReceive1.setAccountStatus(AccountStatus.DUE);
        accountReceive1.setDescription("logistics project in Java");
        accountReceive1.setPrice(89500d);
        accountReceive1.setExpirationDate("23/05/2012");
        accountReceive1.setClient(wholesale);
        AccountReceive accountReceive2 = new AccountReceive(AccountStatus.PAID, telecom, "Online Account Repairs.", 53200d, "13/05/2012");

        AccountsReport report = new AccountsReport();
        Account[] accounts = new Account[]{accountPay1, accountPay2, accountReceive1, accountReceive2};
        report.exhibitReport(accounts);
    }
}