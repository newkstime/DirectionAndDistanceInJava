import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner kybd = new Scanner(System.in);
		System.out.println("Enter the x and y coordinates of two points.");
		System.out.print("Enter first x coordinate: ");
		float x1 = kybd.nextFloat();
		System.out.print("Enter first y coordinate: ");
		float y1 = kybd.nextFloat();
		System.out.print("Enter second x coordinate: ");
		float x2 = kybd.nextFloat();
		System.out.print("Enter second y coordinate: ");
		float y2 = kybd.nextFloat();
		kybd.close();
		String direction = CalculateDirection.calculateDirection(CalculateAngle.calculateAngle(x1, y1, x2, y2), CalculateQuadrant.calculateQuadrant(x1, y1, x2, y2));
		System.out.println("The distance between these points: " + String.format("%.2f", CalculateDistance.calculateDistance(x1, y1, x2, y2)));
		System.out.println("The direction traveled from the first point to the second: " + direction);
	}

}