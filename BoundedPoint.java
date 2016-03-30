import java.awt.Rectangle;

public class BoundedPoint {
	private Rectangle bounds;
	private Point point;

	private class InternalPoint extends Point {
		InternalPoint(int x, int y) {
			super(x, y);
		}

		public void moveTo(int x, int y) {
			if (bounds.contains(x, y))
				super.moveTo(x, y);
		}
	}

	public BoundedPoint(int x, int y, Rectangle r) {
		if (!r.contains(x, y))
			throw new IllegalArgumentException("Point out of bounds");
		point = new InternalPoint(x, y);
		this.bounds = new Rectangle(r);
	}

	public void moveTo(int x, int y) {
		if (bounds.contains(x, y))
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
		if (!(o instanceof BoundedPoint))
			return false;
		BoundedPoint cp = (BoundedPoint) o;
		return cp.point.equals(point) && cp.bounds.equals(bounds);
	}

	public String toString() {
		return point.toString() + " Bounds : " + bounds;
	}
}