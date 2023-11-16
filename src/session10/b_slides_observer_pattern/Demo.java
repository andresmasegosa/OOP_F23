package session10.b_slides_observer_pattern;

public class Demo {

    public static void main(String[] args) {
        BankStatistics bankStatistics = new BankStatistics();
        BankSecurityDepartment securityDepartment = new BankSecurityDepartment();



        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.addListener(bankStatistics);
        bankAccount1.addListener(securityDepartment);

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.addListener(bankStatistics);
        bankAccount2.addListener(securityDepartment);

        System.out.println("Total Bank Balance: "+bankStatistics.getTotalBankBalance());

        bankAccount1.deposit(1000);
        bankAccount2.deposit(3000);
        bankAccount2.deposit(2_000_000);

        System.out.println("Total Bank Balance: "+bankStatistics.getTotalBankBalance());

    }
}
