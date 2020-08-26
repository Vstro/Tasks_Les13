package by.htp.les13.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {
	private List<Account> accounts = new ArrayList<Account>();
	
	public Bank() {}
	
	public Bank(List<Account> accounts) {
		this.accounts.addAll(accounts);
	}
	
	public Bank(Account... accounts) {
		this.accounts.addAll(Arrays.asList(accounts));
	}
	
	public void add(Account account) {
		this.accounts.add(account);
	}
	
	public List<Account> getAccounts() {
		return this.accounts;
	}
}
