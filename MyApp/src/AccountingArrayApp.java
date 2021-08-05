
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

		System.out.println("Value of supply : "+ valueOfSupply);
		System.out.println("VAT : "+ vat );
		System.out.println("Total : "+ total );
		System.out.println("Expense : "+ expense );
		System.out.println("Income : "+ income );
		
		double[] dividendRates = new double[3]; // double형의 데이터를 3개를 담을 수 있는 상자
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		int i =0;
		while(i < dividendRates.length) {
			System.out.println("Dividend : " + (income * dividendRates[i]) );
			i = i + 1;
		}
		
		
	}

}
