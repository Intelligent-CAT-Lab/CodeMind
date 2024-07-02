import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
System.out.println("[INST]7;a;sc.nextInt();"+a);
		int b = sc.nextInt();
System.out.println("[INST]8;b;sc.nextInt();"+b);
		int c = sc.nextInt();
System.out.println("[INST]9;c;sc.nextInt();"+c);
		if(b - a == c - b) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
