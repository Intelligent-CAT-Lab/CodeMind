import java.util.Scanner;

class Main{
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int r = scanner.nextInt();

        if (r <= x && x <= (W - r) && r <= y && y <= (H - r)) {
        	System.out.println("Yes");
        }

        else {
        	System.out.println("No");
        }
	}
}
