import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x1 = scan.nextInt();
System.out.println("[INST]5;x1;scan.nextInt();"+x1);
		int y1 = scan.nextInt();
System.out.println("[INST]6;y1;scan.nextInt();"+y1);
		int x2 = scan.nextInt();
System.out.println("[INST]7;x2;scan.nextInt();"+x2);
		int y2 = scan.nextInt();
System.out.println("[INST]8;y2;scan.nextInt();"+y2);
		scan.close();
		//int l = (int)Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
		int v1x = x2 - x1;
		int v1y = y2 - y1;
		int x4 = -v1y + x1;
		int y4 = v1x + y1;
		int v2x = x1 - x4;
		int v2y = y1 - y4;
		int x3 = -v2y + x4;
		int y3 = v2x + y4;

		System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);


	}
}