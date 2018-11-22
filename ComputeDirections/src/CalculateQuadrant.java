
public class CalculateQuadrant {

	public static int calculateQuadrant(float x1, float y1, float x2, float y2) {
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
}
