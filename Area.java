import java.util.Scanner;

public class Area {

	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	System.out.println("This program calculate the area for Circle, Rectange, Square and Triangle");
	System.out.print("Enter The shape of Figure : ");
	String shape = new String(sc.nextLine());
	Calculate area = new Calculate();

	if(shape.equalsIgnoreCase("CIRCLE")) {

		System.out.println("Enter the radius in centimeter:");
		double radius = sc.nextDouble();
		System.out.println("The area of circle is:"+area.getAreaCircle(radius)+" square centimeters.");		
	}
        else if(shape.equalsIgnoreCase("RECTANGLE")){
                
                System.out.println("Enter Length in centimeters:");
		double length = sc.nextDouble();
		System.out.println("Enter Breadth in centimeters:");
		double breadth = sc.nextDouble();
                System.out.println("The area of rectangle is:"+area.getAreaRectangle(length,breadth)+" square centimeters.");
	}
        else if(shape.equalsIgnoreCase("SQUARE")) {

                System.out.println("Enter Side in centimeters:");
		double side = sc.nextDouble();		
                System.out.println("The area of square is:"+area.getAreaSquare(side)+" square centimeters.");

	}
        else if(shape.equalsIgnoreCase("TRIANGLE")) {

		System.out.println("Enter Base Length in centimeters:");
		double base = sc.nextDouble();
		System.out.println("Enter Height in centimeters:");
		double height = sc.nextDouble();
		
                System.out.println("The area of triangle is:"+area.getAreaTriangle(base,height)+" square centimeters.");
        }
	else {
		System.out.println("Invalid choice,You can only choose rectangle,circle,square,triangle\n");
				
        }
	}

}
