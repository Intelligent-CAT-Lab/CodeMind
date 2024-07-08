import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int K = sc.nextInt();
		double radDiff = Math.PI * 2 / N;
		Point p1f = new Point(1, 0);
var newVariable_0 = Math.cos(radDiff * K);var newVariable_1 = Math.sin(radDiff * K);		Point p1t = new Point(Math.cos(radDiff * K), newVariable_1);
var newVariable_2 = Math.cos(radDiff);var newVariable_3 = Math.sin(radDiff);		Point p2f = new Point(Math.cos(radDiff), newVariable_3);
var newVariable_4 = Math.cos(-radDiff * (K - 1));var newVariable_5 = Math.sin(-radDiff * (K - 1));		Point p2t = new Point(Math.cos(-radDiff * (K - 1)), newVariable_5);
		Point cross = getIntersectPoint(p1f, p1t, p2f, p2t);
		double dx1 = p1f.x - cross.x;
		double dy1 = p1f.y - cross.y;
		double dx2 = p2f.x - cross.x;
		double dy2 = p2f.y - cross.y;
		double area = (dx1 * dy2 - dx2 * dy1) / 2;
		double all = (p1f.x * p2f.y - p2f.x * p1f.y) / 2;
var newVariable_6 = System.out.printf("%.9f\n", (all - area) * N);	}

	static Point getIntersectPoint(Point p1, Point p2, Point p3, Point p4) {
		double x1 = p1.x;
		double y1 = p1.y;
		double x2 = p2.x;
		double y2 = p2.y;
		double x3 = p3.x;
		double y3 = p3.y;
		double x4 = p4.x;
		double y4 = p4.y;
		double dx2 = x4 - x3;
		double dy2 = y4 - y3;
		double s1 = dx2 * (y1 - y3) - (dy2 * (x1 - x3));
		double s2 = dx2 * (y3 - y2) - (dy2 * (x3 - x2));
		double ss = s1 + s2;
		if (ss == 0) return null;
		double sr = s1 / ss;
		double cx1 = x1 + ((x2 - x1) * sr);
		double cy1 = y1 + ((y2 - y1) * sr);
var newVariable_7 = Double.compare(cx1, x1);var newVariable_8 = Double.compare(cx1, x2);		if (Double.compare(cx1, x1) * newVariable_8 > 0) {
			return null;
		}
var newVariable_9 = Double.compare(cy1, y1);var newVariable_10 = Double.compare(cy1, y2);		if (Double.compare(cy1, y1) * newVariable_10 > 0) {
			return null;
		}
var newVariable_11 = Double.compare(cx1, x3);var newVariable_12 = Double.compare(cx1, x4);		if (Double.compare(cx1, x3) * newVariable_12 > 0) {
			return null;
		}
var newVariable_13 = Double.compare(cy1, y3);var newVariable_14 = Double.compare(cy1, y4);		if (Double.compare(cy1, y3) * newVariable_14 > 0) {
			return null;
		}
		return new Point(cx1, cy1);
	}

	static class Point {
		double x, y;

		public Point(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

}