import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
			String S=sc.next();
			String T=sc.next();
			
			StringBuilder buff = new StringBuilder();
			buff.append(S);
			buff.append(T);
			
			System.out.println(T+S);
	}
}