class TestBank {
    public static void main(String[] args) {
		BankAccount bank = new BankAccount();
        System.out.println("New Acc No. - " + bank.getAccountNumber());
		bank.depositMoney(100.49, "checking");
		bank.depositMoney(3.00, "savings");
		bank.displayAccountBalance();

		System.out.println(BankAccount.totalInAccount);

		bank.withdrawMoney(50, "checking");
		bank.withdrawMoney(50, "savings");
		bank.displayAccountBalance();

		System.out.println(BankAccount.totalInAccount);

        BankAccount bank2 = new BankAccount();
        System.out.println("New Acc No. - " + bank2.getAccountNumber());
		bank2.depositMoney(7, "checking");
		bank2.depositMoney(121, "savings");
		bank2.displayAccountBalance();
        bank2.withdrawMoney(20, "checking");
	}
}