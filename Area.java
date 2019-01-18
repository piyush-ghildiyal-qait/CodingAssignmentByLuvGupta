import java.util.Scanner;

public class Area {

	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("This program calculate the area for Circle, Rectange, Square and Triangle");
	System.out.print("Enter The shape of Figure : ");
	String shape = new String(sc.nextLine());
	
	Calculate area = new Calculate();
	
	if(shape.equalsIgnoreCase("CIRCLE")) {

		area.getAreaCircle();
	}
	else if(shape.equalsIgnoreCase("RECTANGLE")){

		area.getAreaRectangle();		
	}
	else if(shape.equalsIgnoreCase("SQUARE")) {
		
		area.getAreaSquare();
	}
	else if(shape.equalsIgnoreCase("TRIANGLE")) {
		
		area.getAreaTriangle();
        }
	else {
		System.out.println("Invalid choice,You can only choose rectangle,circle,square,triangle\n");
				
        }
	}

}
