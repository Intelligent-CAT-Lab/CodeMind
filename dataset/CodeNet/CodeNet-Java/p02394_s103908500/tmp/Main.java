import java.util.Scanner;

class Main{
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
System.out.println("[INST]5;W;scanner.nextInt();"+W);
        int H = scanner.nextInt();
System.out.println("[INST]6;H;scanner.nextInt();"+H);
        int x = scanner.nextInt();
System.out.println("[INST]7;x;scanner.nextInt();"+x);
        int y = scanner.nextInt();
System.out.println("[INST]8;y;scanner.nextInt();"+y);
        int r = scanner.nextInt();
System.out.println("[INST]9;r;scanner.nextInt();"+r);

        if (r <= x && x <= (W - r) && r <= y && y <= (H - r)) {
        	System.out.println("Yes");
        }

        else {
        	System.out.println("No");
        }
	}
}
