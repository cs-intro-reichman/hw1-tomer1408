// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double numberOfYears = Double.parseDouble(args[0]);
		double currentValue = Double.parseDouble(args[1]);
		double rate = Double.parseDouble(args[2]);
		double futureValue = currentValue * Math.pow(1 + rate, numberOfYears);

		System.out.println("After " + (int) numberOfYears + " years, " + currentValue +
		 " $ saved at " + rate + " % will yield " + futureValue + " $");

		

	}
}


