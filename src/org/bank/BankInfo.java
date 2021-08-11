package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
		System.out.println("Interest");
		System.out.println("--------");
		System.out.println("Saving account   : 8%");
	}
	
	public void fixed() {
		System.out.println("Fixed deposite   : 9%");

	}
	@Override
	public void deposite() {
		System.out.println("Recurring Deposit : 7.5%");
	}
	public static void main(String[] args) {
		BankInfo b = new BankInfo();
		b.saving();
		b.deposite();
		b.fixed();
	}

}
