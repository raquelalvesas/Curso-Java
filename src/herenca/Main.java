package herenca;

import herenca.entities.Account;
import herenca.entities.BusinessAccount;
import herenca.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Suponha um negócio de banco que possui uma conta comum e uma conta para empresas,
        // sendo que a conta para empresa possui todos membros da conta comum,
        // mais um limite de empréstimo e uma operação de realizar empréstimo.

        //Account acc1 = new Account(1001, "Alex", 1000.0);
       // acc1.withdraw(200.0);
       // System.out.println(acc1.getBalance());

       // Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
       // acc2.withdraw(200.0);
        //System.out.println(acc2.getBalance());

       // Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        //acc3.withdraw(200.0);
        //System.out.println(acc3.getBalance());

        // Polimorfismo:
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for (Account acc : list) {
            acc.deposit(10.0);
        }
        for (Account acc : list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }
}