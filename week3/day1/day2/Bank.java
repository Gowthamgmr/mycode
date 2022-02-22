package week3.day2;

public class Bank extends SBI implements CIBIL,PNB {

	public static void main(String[] args) {
//		Bank obj=new Bank();
//		obj.cibilScore();
//		obj.maximumLoanAmount();
//		obj.creditScore();
//		obj.minimumBalance();
//		obj.ITLoan();
//		obj.maximumLoanAmount();
		
		
		//If creating a multiple object 
			SBI get=new Bank();
				get.ITLoan();
				get.maximumLoanAmount();
				get.bankBalance();
					
			PNB get1=new Bank();
				get1.creditScore();
				get1.maximumLoanAmount();
				get1.minimumBalance();
					
			CIBIL get2=new Bank();
				get2.cibilScore();
				
	}

	public void creditScore() {
		System.out.println("credit Score");
	}

	public void minimumBalance() {
		System.out.println("Minimum Balance");
	}

	public void cibilScore() {
		System.out.println("Cibil Score");
	}

	@Override
	public void bankBalance() {
		System.out.println("Bank Balance");
	}

	@Override
	public void maximumLoanAmount() {
		System.out.println("Maximum Loan Amount");
	}


		
}


