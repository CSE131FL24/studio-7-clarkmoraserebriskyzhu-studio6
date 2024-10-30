package studio7;



public class Rectangle {

	private int length;
	private int width;
	public Rectangle(int length, int initWidth) {
		this.length = length;
		width = initWidth;
	}
	public int Area() {
		return width * length;
	}
	public int Perimeter() {
		return 2 * (length + width);
	}
	public boolean isSquare() {
		return width == length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(5, 5);
		int area = r1.Area();
		System.out.println(area);
		int perimeter = r1.Perimeter();
		System.out.println(perimeter);
		boolean square = r1.isSquare();
		System.out.println(square);
	}

}
