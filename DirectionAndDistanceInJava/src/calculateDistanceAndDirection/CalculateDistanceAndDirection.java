package calculateDistanceAndDirection;

import java.util.Map;

public class CalculateDistanceAndDirection {
	
	public static double calculateDistance(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}
	
	public static int calculateQuadrant(double x1, double y1, double x2, double y2) {
		if ((x2 - x1) > (0.0) && (y2 - y1) >= (0.0)) {
			return 1;
		} else if ((x2 - x1) <= (0.0) && (y2 - y1) > (0.0)) {
			return 2;
		} else if ((x2 - x1) < (0.0) && (y2 - y1) <= (0.0)) {
			return 3;
		} else {
			return 4;
		}
	}

	public static double calculateAngle(double x1, double y1, double x2, double y2) {
		double x3;
		double y3;
		int quadrant = calculateQuadrant(x1, y1, x2, y2);
		if (quadrant ==1 || quadrant == 3) {
			x3 = x2;
			y3 = y1;
		} else {
			x3 = x1;
			y3 = y2;
		}
		double sideA = calculateDistance(x2, y2, x3, y3);
		double sideB = calculateDistance(x1, y1, x3, y3);
		double sideC = calculateDistance(x1, y1, x2, y2);
		return Math.toDegrees(Math.acos(((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2))
				/ (2 * (sideB * sideC)))));
		
	}
	
	public static String calculateDirection(double angle, int quadrant) {
		int key = 0;
		if (angle > 00.00 && angle < 11.25) {
			key = 1;
		} else if (angle > 11.26 && angle < 33.75) {
			key = 2;
		} else if (angle > 33.76 && angle < 56.25) {
			key = 3;
		} else if (angle > 56.26 && angle < 78.75) {
			key = 4;
		} else if (angle > 78.26 && angle < 90.00) {
			key = 5;
		} else {
			System.out.print("ERROR: Angle out of range.");
		}
		
		Map<Integer, String> q1Map = Map.of(1, "E", 2, "ENE", 3, "NE", 4, "NNE", 5, "N");
		Map<Integer, String> q2Map = Map.of(1, "N", 2, "NNW", 3, "NW", 4, "WNW", 5, "W");
		Map<Integer, String> q3Map = Map.of(1, "W", 2, "WSW", 3, "SW", 4, "SSW", 5, "S");
		Map<Integer, String> q4Map = Map.of(1, "S", 2, "SSE", 3, "SE", 4, "ESE", 5, "E");
		
		if (quadrant == 1) {
			return q1Map.get(key);
		} else if (quadrant == 2) {
			return q2Map.get(key);
		} else if (quadrant == 3) {
			return q3Map.get(key);
		} else {
			return q4Map.get(key);
		}	
	}
}
