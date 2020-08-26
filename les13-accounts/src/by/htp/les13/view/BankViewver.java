package by.htp.les13.view;

import java.util.List;

import by.htp.les13.entity.Account;
import by.htp.les13.entity.Bank;

public class BankViewver {
	public void printAll(String message, List<Account> accounts) {
		System.out.println("------------------------------");
		System.out.println(message);
		System.out.println("------------------------------");

		for (int i = 0; i < accounts.size(); i++) {
			Account account = accounts.get(i);			
			System.out.println("Account of " + account.getClient() + ": " + account.getScore());
		}
	}
	
	public void printAll(String message, Bank bank) {
		System.out.println("------------------------------");
		System.out.println(message);
		System.out.println("------------------------------");

		List<Account> accounts = bank.getAccounts();
		for (int i = 0; i < accounts.size(); i++) {
			Account account = accounts.get(i);			
			System.out.println("Account of " + account.getClient() + ": " + account.getScore());
		}
	}
}
