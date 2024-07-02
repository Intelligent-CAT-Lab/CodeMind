import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int W = cin.nextInt();
System.out.println("[INST]5;W;cin.nextInt();"+W);
		int H = cin.nextInt();
System.out.println("[INST]6;H;cin.nextInt();"+H);
		int x = cin.nextInt();
System.out.println("[INST]7;x;cin.nextInt();"+x);
		int y = cin.nextInt();
System.out.println("[INST]8;y;cin.nextInt();"+y);
		int r = cin.nextInt();
System.out.println("[INST]9;r;cin.nextInt();"+r);
		if((x-r)>=0 && (x+r)<=W && (y-r)>=0 && (y+r)<=H) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
