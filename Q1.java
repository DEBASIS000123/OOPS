import java.util.*;
class BankAccount{
	int acno;
	double balance;
	String address;
	void deposit(int amount) {
		balance+=amount;
	}
	void withdraw (int amount) {
		balance-=amount;
	}
	void displayinfo() {
		System.out.println(balance);
	}
}

public class Q1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BankAccount b1=new BankAccount();
		BankAccount b2=new BankAccount();
		b1.acno=101;		
		b1.balance=20000;
		b1.address="ITER";
		
		b2.acno=102;
		b2.balance=10000;
		b2.address="SUM";
		
		System.out.println("Write your account no :");
		int n=sc.nextInt();
		if(n==101) {
			System.out.println("For deposit :1 , withdraw :2");
			int c=sc.nextInt();
			System.out.println("Enter amount :");
			int amt=sc.nextInt();
			if(c==1) {
				b1.deposit(amt);
			}
			else if(c==2) {
				b1.withdraw(amt);
			}
			else {
				System.out.println("Invalid choice ?!! Try again");
				System.exit(1);
			}
			System.out.println("Do you want to display balance ? :(Y'\'N) ");
			char ch=sc.next().charAt(0);
			if(ch=='y'||ch=='Y') {
			b1.displayinfo();
			}
			else {
				System.out.println("Thank you !");
			}
		}
		else if(n==102) {
			System.out.println("For deposit :1 , withdraw :2");
			int c=sc.nextInt();
			System.out.println("Enter amount :");
			int amt=sc.nextInt();
			if(c==1) {
				b2.deposit(amt);
			}
			else if(c==2) {
				b2.withdraw(amt);
			}
			else {
				System.out.println("Invalid choice ?!! Try again");
				System.exit(1);
		}
			System.out.println("Do you want to display balance ? :(Y'\'N) ");
			char ch=sc.next().charAt(0);
			if(ch=='y'||ch=='Y') {
				b2.displayinfo();
			}
			else {
				System.out.println("Thank you !");
			}
		}
		else {
			System.out.println("Invalid Account number !!!");
		}
	}
		
}

