
import java.awt.Color;

public class ColorPoint {
	private Color color;
	private Point point;

	public ColorPoint(int x, int y, Color color) {
		point = new Point(x, y);
		this.color = color;
	}

	public void moveTo(int x, int y) {
		point.moveTo(x, y);
	}

	public int getX() {
		return point.getX();
	}

	public int getY() {
		return point.getY();
	}

	public Point asPoint() {
		return point;
	}

	public boolean equals(Object o) {
		if (!(o instanceof ColorPoint))
			return false;
		ColorPoint cp = (ColorPoint) o;
		return cp.point.equals(point) && cp.color == color;
	}

	public String toString() {
		return point.toString() + " Color : " + color;
	}
}