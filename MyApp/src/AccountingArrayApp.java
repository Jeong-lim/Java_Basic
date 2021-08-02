
public class AccountingArrayApp {

	public static void main(String[] args) {
		//... 변수가 많아질 수록 변수가 더럽혀질 가능서이 크다
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		double rate1 = 0.5;
		double rate2 = 0.5;
		double rate3 = 0.5;

		double[] dividendRates = new double[3]; // double형의 데이터를 3개를 담을 수 있는 상자
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
		System.out.println("Value of supply : "+ valueOfSupply);
		System.out.println("VAT : "+ vat );
		System.out.println("Total : "+ total );
		System.out.println("Expense : "+ expense );
		System.out.println("Income : "+ income );
		System.out.println("Dividend1 : "+ dividend1 );
		System.out.println("Dividend1 : "+ dividend2 );
		System.out.println("Dividend1 : "+ dividend3 );
		
	}

}
