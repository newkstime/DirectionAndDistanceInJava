import java.util.Map;

public class CalculateDirection {
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
