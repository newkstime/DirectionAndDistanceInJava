import java.util.Scanner;
import static calculateDistanceAndDirection.CalculateDistanceAndDirection.*;

public class Main {

	public static void main(String[] args) {
		Scanner kybd = new Scanner(System.in);
		System.out.println("Enter the x and y coordinates of two points.");
		System.out.print("Enter first x coordinate: ");
		double x1 = kybd.nextFloat();
		System.out.print("Enter first y coordinate: ");
		double y1 = kybd.nextFloat();
		System.out.print("Enter second x coordinate: ");
		double x2 = kybd.nextFloat();
		System.out.print("Enter second y coordinate: ");
		double y2 = kybd.nextFloat();
		kybd.close();
		
		double angle = calculateAngle(x1, y1, x2, y2);
		int quadrant = calculateQuadrant(x1, y1, x2, y2);
		double distance = calculateDistance(x1, y1, x2, y2);
		String direction = calculateDirection(angle, quadrant);
		System.out.println("The distance between these points: " + String.format("%.2f", distance));
		System.out.println("The direction traveled from the first point to the second: " + direction);
		
	}
}