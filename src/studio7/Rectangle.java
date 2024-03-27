package studio7;
import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	
	private double length;
	
	private double width;
	
	public Rectangle(double l, double w) {
		
		length = l;
		width = w;
		
	}

	public static void main(String[] args) {
		
		Rectangle R = new Rectangle(.5, .5);
		
		R.makeRectangle();
		System.out.println(R.getArea());

	}
	
	public void makeRectangle() {
		
		StdDraw.rectangle(.5, .5, width/2, length/2);
			
		
	}
	
	public double getArea() {
		
		double area = length * width;
		return area;
		
	}
	
	public double getPerimeter() {
		
		double perimeter = 2*length + 2*width;
		return perimeter;
	}
	
	
	
	

}
