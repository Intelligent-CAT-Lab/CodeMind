import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ary = new int [11];
		int r = sc.nextInt();
System.out.println("[INST]6;r;sc.nextInt();"+r);
		int d = sc.nextInt();
System.out.println("[INST]7;d;sc.nextInt();"+d);
		ary[0] = sc.nextInt();
System.out.println("[INST]8;None;sc.nextInt();"+sc.nextInt());
		for(int i = 0; i < 10; i++){
			ary[i + 1] = ary[i] * r - d;
			System.out.println(ary[i + 1]);
		}
	}
}
