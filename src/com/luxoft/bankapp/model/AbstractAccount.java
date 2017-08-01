package com.luxoft.bankapp.model;



public abstract class AbstractAccount implements Account {
	protected float balance;


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Account account = (Account) o;

		if (!getAccountName().equals(account.getAccountName())) return false;
		return getAccountName() == account.getAccountName();
	}

	@Override
	public int hashCode() {
		int result = getAccountName().hashCode();
		result = 31 * result;
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String accountName = getAccountName();
		sb.append("Account{" +
				"accountName="+accountName+
				"balance=" + balance +
				'}');

		return sb.toString();
	}

	public Double decimalValue(float x){
		Double decimal = (double)Math.round(x * 100000d) / 100000d;
		return decimal;
	}

	@Override
	public void printReport() {
		System.out.println("Account balance: " + balance);
	}

	@Override
	public void deposit(float x) throws IllegalArgumentException {
		if (x >= 0) {
			balance += x;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	public float getBalance() {
		return balance;
	}

}
