import java.util.Scanner;

public class Calculate {
	
	Scanner sc = new Scanner(System.in);
	
	public void getAreaCircle() {
		
                System.out.println("Enter the Radius in centimeter:");
		double radius = sc.nextDouble();
		double area = 3.14*radius*radius;
		System.out.println("The area of circle is:"+area+" square centimeters.");
		
		
	}
	
	public void getAreaRectangle() {
		System.out.println("Enter Length in centimeters:");
		double length = sc.nextDouble();
		System.out.println("Enter Breadth in centimeters:");
		double breadth = sc.nextDouble();
		double area = length*breadth;
		System.out.println("The area of reactangle is:"+area+" square centimeters.");
		
	}
	
	public void getAreaSquare() {
		
		System.out.println("Enter Side in centimeters:");
		double side = sc.nextDouble();
		double area = side*side;
		System.out.println("The area of square is:"+area+" square centimeters.");
		
	}
	
	public void getAreaTriangle() {
		System.out.println("Enter Base Length in centimeters:");
		double base = sc.nextDouble();
		System.out.println("Enter Height in centimeters:");
		double height = sc.nextDouble();
		double area = (1.0/2.0)*base*height;
		System.out.println("The area of triangle is:"+area+" square centimeters.");
		
		
	}
	
	

}
