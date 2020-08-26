package by.htp.les13.main;

import by.htp.les13.entity.Account;
import by.htp.les13.entity.Bank;
import by.htp.les13.logic.BankLogic;
import by.htp.les13.view.BankViewver;

public class Main {

	public static void main(String[] args) {
		Bank bank = new Bank();
		BankLogic logic = new BankLogic();
		BankViewver view = new BankViewver();
		
		bank.add(new Account(10, "Igorenko V. A."));
		bank.add(new Account(100, "Nekrasov B. S."));
		bank.add(new Account(-20, "Igorenko V. A."));
		bank.add(new Account(-5, "Nekrasov B. S."));
		bank.add(new Account(0, "Bigel D. R."));
		
		view.printAll("All accounts:", bank);
		
		view.printAll("All accounts of Igorenko V. A.:", logic.searchByClient(bank, "Igorenko V. A."));
		
		view.printAll("All accounts of Nekrasov B. S.:", logic.searchByClient(bank, "Nekrasov B. S."));

		view.printAll("All accounts of Bigel D. R.:", logic.searchByClient(bank, "Bigel D. R."));

		view.printAll("Sorted accounts:", logic.sortByScore(bank, true));
		
		System.out.println("Sum of positive accounts: " + logic.signScoresSum(bank, true));
		
		System.out.println("Sum of negative accounts: " + logic.signScoresSum(bank, false));

		System.out.println("Sum of all accounts: " + logic.allScoresSum(bank));
		
		bank.getAccounts().get(0).block();
		bank.getAccounts().get(1).block();

		view.printAll("All accounts of Igorenko V. A.:", logic.searchByClient(bank, "Igorenko V. A."));
		
		view.printAll("All accounts of Nekrasov B. S.:", logic.searchByClient(bank, "Nekrasov B. S."));

		view.printAll("All accounts of Bigel D. R.:", logic.searchByClient(bank, "Bigel D. R."));
		
		System.out.println("Sum of all accounts: " + logic.allScoresSum(bank));
	}

}
