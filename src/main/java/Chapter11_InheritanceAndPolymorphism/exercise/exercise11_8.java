package Chapter11_InheritanceAndPolymorphism.exercise;

public class exercise11_8 {
    public static void main(String[] args) {
        Account account = new Account("George", 1122, 1000);

        account.setAnnualInterestRate(1.5);

        account.deposit(30);
        account.deposit(40);
        account.deposit(50);

        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println("       Account Summary");
        System.out.println("------------------------------------");
        System.out.println("Account holder name: " + account.getName());
        System.out.println("Interest rate: " + account.getAnnualInterestRate());
        System.out.printf("Balance: $%.2f\n", account.getBalance());
        System.out.println("\n     List of transactions");
        System.out.println("------------------------------------");
        for (int i = 0; i < account.getTransactions().size(); i++) {
            System.out.println("Date: " +
                    (account.getTransactions()).get(i).getType());
            System.out.println("Type: " +
                    (account.getTransactions()).get(i).getType());
            System.out.println("Amount: " +
                    (account.getTransactions()).get(i).getNext());
            System.out.println("Balance: " +
                    (account.getTransactions()).get(i).getClass());
            System.out.println("Description: " +
                    (account.getTransactions()).get(i).getNext());
            System.out.println();
        }
    }
}
