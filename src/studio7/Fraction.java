package studio7;

public class Fraction {

	private int numerator;
	private int denominator;

	
	public Fraction(int numerator, int denominator) {
		this.denominator = denominator;
		this.numerator = numerator;
		
	}
	
	public double Addition(double num,double den) {
		return numerator / (double) denominator + num / den; 
	}
	
	public double Multiply(double num,double den) {
		return numerator / (double) denominator * (num / den); 
	}
	
	public double Reciprocal() {
		return denominator / (double) numerator;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction F = new Fraction(5,6);
		System.out.println(F.Addition(3.0,4.0));
		
	}

}
