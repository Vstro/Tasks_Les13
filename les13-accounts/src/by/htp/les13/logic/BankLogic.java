package by.htp.les13.logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.htp.les13.entity.Account;
import by.htp.les13.entity.Bank;

public class BankLogic {
	public List<Account> searchByClient(Bank bank, String client) {
		List<Account> result = new ArrayList<Account>();
		List<Account> accounts = bank.getAccounts();
		
		for (int i = 0; i < accounts.size(); i++) {
			if (!accounts.get(i).isActive()) {
				accounts.remove(i);
				i--;
			}
		}
		
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getClient().equals(client)) {
				result.add(accounts.get(i));
			}
		}
		
		return result;
	}
	
	public List<Account> sortByScore(Bank bank, boolean diminishing) {
		List<Account> accounts = bank.getAccounts();
		
		if(accounts.size() <= 1) {
			return accounts;
		}
		
		for (int i = 0; i < accounts.size(); i++) {
			if (!accounts.get(i).isActive()) {
				accounts.remove(i);
				i--;
			}
		}
		
		if (diminishing) {
			accounts.sort(new Comparator<Account>() {
				public int compare(Account ac1, Account ac2) {
					return ac2.getScore() - ac1.getScore();
				}
			});
		} else {
			accounts.sort(new Comparator<Account>() {
				public int compare(Account ac1, Account ac2) {
					return ac1.getScore() - ac2.getScore();
				}
			});
		}
		
		return accounts;
	}
	
	public int allScoresSum(Bank bank) {
		List<Account> accounts = bank.getAccounts();
		int sum = 0;
		
		for (int i = 0; i < accounts.size(); i++) {
			if (!accounts.get(i).isActive()) {
				accounts.remove(i);
				i--;
			}
		}
		
		for (int i = 0; i < accounts.size(); i++) {
			sum += accounts.get(i).getScore();
		}
		
		return sum;
	}
	
	public int signScoresSum(Bank bank, boolean positive) {
		List<Account> accounts = bank.getAccounts();
		int sum = 0;
		
		for (int i = 0; i < accounts.size(); i++) {
			if (!accounts.get(i).isActive()) {
				accounts.remove(i);
				i--;
			}
		}
		
		for (int i = 0; i < accounts.size(); i++) {
			if (positive == (accounts.get(i).getScore() > 0)) {
				sum += accounts.get(i).getScore();
			}
		}
		
		return sum;
	}
}
