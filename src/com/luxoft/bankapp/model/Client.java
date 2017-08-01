package com.luxoft.bankapp.model;

import java.util.ArrayList;
import java.util.List;

import com.luxoft.bankapp.exceptions.NotEnoughFundsException;

public class Client implements Report {
	private String name;
	private List<Account> accounts = new ArrayList<Account>();
	
	private Account activeAccount;
	private float initialOverdraft;
	private float initialBalance;
	private Gender gender;


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Client client = (Client) o;

		if (!name.equals(client.name)) return false;
		return gender == client.gender;
	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + gender.hashCode();
		return result;
	}


	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("Client{");
		sb.append("name='" + name);
		sb.append(", accounts=");
		for (Account account:accounts
			 ) {
			sb.append(account.toString());
		}
		sb.append(", activeAccount=" + activeAccount +
				", initialOverdraft=" + initialOverdraft +
				", initialBalance=" + initialBalance +
				", gender=" + gender +
				'}');

		return sb.toString();
	}

	public enum Gender {
		MALE("Mr"), FEMALE("Ms");

		private String prefix;

		String getSalutation() {
			return prefix;
		}

		Gender(String prefix) {
			this.prefix = prefix;
		}

	}
	public String getGender() { return gender==Gender.MALE?"m":"f"; }
	
	public Client(String name, float initialOverdraft, Gender gender) {
		this.name = name;
		this.initialOverdraft = initialOverdraft;
		this.gender = gender;
	}

	public Client(String name, Gender gender) {
		this(name, 0, gender);
	}

	public float getInitialBalance() {
		return initialBalance;
	}

	public void setInitialBalance(float initialBalance) {
		this.initialBalance = initialBalance;
	}

	public void setInitialOverdraft(float initialOverdraft) {
		this.initialOverdraft = initialOverdraft;
	}

	public void setActiveAccount(Account activeAccount) {
		this.activeAccount = activeAccount;
	}

	public String getName() {
		return this.name;
	}

	public float getBalance() {
		return activeAccount.getBalance();

	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public void deposit(float x) throws IllegalArgumentException {
		activeAccount.deposit(x);
	}

	public void withdraw(float x) throws NotEnoughFundsException {
		activeAccount.withdraw(x);
	}

	public Account createAccount(String accountType) {
		switch (accountType) {
			case "Saving": {
				return new SavingAccount(initialBalance);
			}
			case "Checking": {
				return new CheckingAccount(initialOverdraft);
			}
			default: {
				return null;
			}
		}
	}

	public void printReport() {
		System.out.println("Name : " + this.getClientSalutation() + " " + name);
		for (Account a : accounts) {
			System.out.print(a.getAccountName() + " balance: " + a.getBalance()
					+ " ");
		}
		System.out.println();

	}

	public String getClientSalutation() {
		return gender.getSalutation();
	}
}
