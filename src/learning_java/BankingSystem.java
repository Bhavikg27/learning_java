package learning_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    public void displayAllAccounts() {
        for (Account account : accounts) {
            System.out.println("Account Number: " + account.getAccountNumber() + ", Balance: " + account.getBalance());
        }
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        boolean running = true;
        while (running) {
            System.out.println("Welcome to Our Bank!");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. View Account Balance");
            System.out.println("6. View All Accounts");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter initial balance: ");
                    double initialBalance = scanner.nextDouble();
                    Account account = new Account((int) (Math.random() * 10000), initialBalance);
                    bank.addAccount(account);
                    System.out.println("Account created successfully. Your account number is: " + account.getAccountNumber());
                }
                case 2 -> {
                    System.out.print("Enter account number: ");
                    int depositAccountNumber = scanner.nextInt();
                    Account depositAccount = bank.findAccount(depositAccountNumber);
                    if (depositAccount != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        depositAccount.deposit(depositAmount);
                        System.out.println("Deposit successful. Updated balance: " + depositAccount.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                }
                case 3 -> {
                    System.out.print("Enter account number: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    Account withdrawAccount = bank.findAccount(withdrawAccountNumber);
                    if (withdrawAccount != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdrawAccount.withdraw(withdrawAmount);
                        System.out.println("Withdrawal successful. Updated balance: " + withdrawAccount.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter your account number: ");
                    int yourAccountNumber = scanner.nextInt();
                    Account yourAccount = bank.findAccount(yourAccountNumber);
                    if (yourAccount != null) {
                        System.out.print("Enter recipient's account number: ");
                        int recipientAccountNumber = scanner.nextInt();
                        Account recipientAccount = bank.findAccount(recipientAccountNumber);
                        if (recipientAccount != null) {
                            System.out.print("Enter transfer amount: ");
                            double transferAmount = scanner.nextDouble();
                            if (yourAccount.withdraw(transferAmount)) {
                                recipientAccount.deposit(transferAmount);
                                System.out.println("Transfer successful.");
                            } else {
                                System.out.println("Insufficient funds for transfer.");
                            }
                        } else {
                            System.out.println("Recipient's account not found.");
                        }
                    } else {
                        System.out.println("Your account not found.");
                    }
                }
                case 5 -> {
                    System.out.print("Enter account number: ");
                    int viewAccountNumber = scanner.nextInt();
                    Account viewAccount = bank.findAccount(viewAccountNumber);
                    if (viewAccount != null) {
                        System.out.println("Current balance: " + viewAccount.getBalance());
                    } else {
                        System.out.println("Account not found.");
                    }
                }
                case 6 -> {
                    System.out.println("All Accounts:");
                    bank.displayAllAccounts();
                }
                case 7 -> running = false;
                default -> System.out.println("Invalid option.");
            }
            System.out.println(); // Add a blank line for better readability
        }
        System.out.println("Exiting program. Thank you!");
        scanner.close();
    }
}
