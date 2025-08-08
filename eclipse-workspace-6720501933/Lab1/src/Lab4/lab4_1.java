package Lab4;

public class lab4_1 {

	public static void main(String[] args) {
		Date d = new Date(31,11,2023);
		System.out.print("Day:" + d+"\n");
		Date toDay = new Date(25,7,2025);
		BankAccount a1 = new BankAccount("Alice");
		BankAccount a2 = new BankAccount("MadHat",500);
		Date MadDay = new Date(1,11,2015);
		a1.deposit(1000);
		a2.transfer(a1, 300);
		a2.withdraw(300);
		
		System.out.print(a1.getInfo()+"|Day:"+toDay+"\n");
		System.out.print(a2.getInfo()+"|Day:"+MadDay);
	}

}
