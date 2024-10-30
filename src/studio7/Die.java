package studio7;

public class Die {

	private int sides;
	
	public Die(int n) {
		sides = n;
	}
	
	public int Random() {
		return (int) ((Math.random() * sides + 1));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die D1 = new Die(20);
		System.out.println(D1.Random());
		
	}

}
