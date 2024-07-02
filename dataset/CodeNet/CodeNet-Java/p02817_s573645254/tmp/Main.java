import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
			String S=sc.next();
System.out.println("[INST]8;S;sc.next();"+S);
			String T=sc.next();
System.out.println("[INST]9;T;sc.next();"+T);
			
			StringBuilder buff = new StringBuilder();
			buff.append(S);
System.out.println("[INST]12;None;buff.append(S);"+buff.append(S));
			buff.append(T);
System.out.println("[INST]13;None;buff.append(T);"+buff.append(T));
			
			System.out.println(T+S);
	}
}