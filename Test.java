import java.awt.Rectangle;

public class Test {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(0, 0, 10, 10);
		BoundedPoint bp = new BoundedPoint(5, 5, r);

		bp.moveTo(20, 20);
		System.out.println("Current point = " + bp);

		bp.asPoint().moveTo(20, 20);
		System.out.println("Current point = " + bp);
	}
}
