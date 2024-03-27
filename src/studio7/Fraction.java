package studio7;


public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	
	public static void main(String[] args) {
		
		Fraction f = new Fraction(5, 4);
		f.getFraction();
		
		f.addFraction(5, 4);
		
		f.multiplyFraction(5, 4);
		
		f.reciprocal();

	}
	
	public void getFraction() {
		System.out.println(numerator + "/" + denominator);
	}
	
	public void addFraction(int n, int d) {
		
		int newNumerator = numerator * d;
		
		int newN = n * denominator;
		
		int newDenominator = denominator * d;
		
		
		int sumNumerator = newNumerator + newN;
		int sumDenominator = newDenominator;
		
		System.out.println(sumNumerator + "/" + sumDenominator);
		
	}
	
	public void multiplyFraction(int n, int d) {
		
		int multNumerator = n * numerator;
		int multDenominator = d * denominator;
		
		System.out.println(multNumerator + "/" + multDenominator);

		
	}
	
	public void reciprocal() {
		
		System.out.println(denominator + "/" + numerator);
	}
	
	public void simplify() {

		}
		
	}

}
