import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
System.out.println("[INST]8;a;sc.nextInt();"+a);
		int b = sc.nextInt();
System.out.println("[INST]9;b;sc.nextInt();"+b);
		int c = sc.nextInt();
System.out.println("[INST]10;c;sc.nextInt();"+c);
		
		// 計算
		String result = "NO";
		if(b - a == c - b) result = "YES";
		
		
		// 出力
		System.out.println(result);
	}
}

