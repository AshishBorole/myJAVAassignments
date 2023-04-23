package tester;
import java.util.*;
import letsdoit.Point2D;
public class Testerpoint2d {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        // Accept coordinates of p1
		        System.out.print("Enter x-coordinate of p1: ");
		        double x1 = scanner.nextDouble();
		        System.out.print("Enter y-coordinate of p1: ");
		        double y1 = scanner.nextDouble();
		        Point2D p1 = new Point2D(x1, y1);
		        
		        // Accept coordinates of p2
		        System.out.print("Enter x-coordinate of p2: ");
		        double x2 = scanner.nextDouble();
		        System.out.print("Enter y-coordinate of p2: ");
		        double y2 = scanner.nextDouble();
		        Point2D p2 = new Point2D(x2, y2);
		        
		        // Display point details
		        System.out.println("p1 details: " + p1.getDetails());
		        System.out.println("p2 details: " + p2.getDetails());
		        
		        // Check if p1 and p2 are equal
		        if (p1.isEqual(p2)) {
		            System.out.println("p1 and p2 are located at the same position");
		        } else {
		            System.out.println("p1 and p2 are not located at the same position");
		        }
		        
		        // Calculate and display distance between p1 and p2
		        double distance = p1.calculateDistance(p2);
		        System.out.println("Distance between p1 and p2: " + distance);
		    }
		
	}

