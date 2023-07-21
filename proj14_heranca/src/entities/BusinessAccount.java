package entities;

//Cláusula "Extends" faz a herança
public class BusinessAccount extends Account {

	private Double loanLimit;
	
	public BusinessAccount() {
		// Cláusula "super" para caso de modificação no construtor padrão da classe pai
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		//Cláusula "super" para reaproveitar construtor da classe pai
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	// Sobreposição de método usando a cláusula "@Override"
	// Métodos sobrepostos, por convenção, são "final" para evitar sobreposições múltiplas
	@Override
	public final void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}
