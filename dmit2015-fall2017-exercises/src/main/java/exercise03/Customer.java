package exercise03;

public class Customer {

	private int id;			// getter/setter
	private SavingsAccount savingAccount;	//getter/setter
	private CheckingAccount checkingAccount; //getter/setter
	
	public void addSavingAccount() {
		savingAccount = new SavingsAccount();
	}
	
	public void addCheckingAccount() {
		checkingAccount = new CheckingAccount();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SavingsAccount getSavingAccount() {
		return savingAccount;
	}

	public void setSavingAccount(SavingsAccount savingAccount) {
		this.savingAccount = savingAccount;
	}

	public CheckingAccount getCheckingAccount() {
		return checkingAccount;
	}

	public void setCheckingAccount(CheckingAccount checkingAccount) {
		this.checkingAccount = checkingAccount;
	}
	
}
