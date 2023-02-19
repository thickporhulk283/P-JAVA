public class testaccount {
    public static void main(String[] args) {
		account account1 = new account(003, "Hoang Thanh Lam", 2588);
		account1.display();
		account1.withdraw(2100);
		account1.deposit(600);
		System.out.println("Balance: " + account1.getBalance());
		account1.withdraw(2100);
		System.out.println("Balance: " + account1.getBalance());
	}
}
