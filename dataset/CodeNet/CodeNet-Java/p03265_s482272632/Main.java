import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		int x3;
		int y3;
		int x4;
		int y4;

		int diffX = x2-x1;
		int diffY = y2-y1;
		x3 = x2 - diffY;
		y3 = y2 + diffX;
		x4 = x3 - diffX;
		y4 = y3 - diffY;
		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
	}
}
