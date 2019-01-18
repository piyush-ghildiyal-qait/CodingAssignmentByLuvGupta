import java.util.Scanner;

public class Calculate {
	
	Scanner sc = new Scanner(System.in);
	
	public double getAreaCircle(double radius) {
		
                double area = 3.14*radius*radius;
		return area;	
	}
	
	public double getAreaRectangle(double length,double breadth) {
		
		double area = length*breadth;
		return area;
	}
	
	public double getAreaSquare(double side) {
		
		double area = side*side;
       		return area;		
	}
	
	public double getAreaTriangle(double base,double height) {
		
		double area = (1.0/2.0)*base*height;
		return area;
	}
	
}
