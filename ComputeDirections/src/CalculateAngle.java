
public class CalculateAngle {
	public static double calculateAngle(float x1, float y1, float x2, float y2) {
		float x3;
		float y3;
		int quadrant = CalculateQuadrant.calculateQuadrant(x1, y1, x2, y2);
		if (quadrant ==1 || quadrant == 3) {
			x3 = x2;
			y3 = y1;
		} else {
			x3 = x1;
			y3 = y2;
		}
		double sideA = CalculateDistance.calculateDistance(x2, y2, x3, y3);
		double sideB = CalculateDistance.calculateDistance(x1, y1, x3, y3);
		double sideC = CalculateDistance.calculateDistance(x1, y1, x2, y2);
		return Math.toDegrees(Math.acos(((Math.pow(sideB, 2) + Math.pow(sideC, 2) - Math.pow(sideA, 2))
				/ (2 * (sideB * sideC)))));
		
	}
}
