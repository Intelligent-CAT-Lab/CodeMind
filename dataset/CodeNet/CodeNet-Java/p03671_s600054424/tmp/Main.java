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
		int result = 0;
		result = a+b+c-max(a, max(b, c));
System.out.println("[INST]14;None;max(a, max(b, c));"+max(a, max(b, c)));
System.out.println("[INST]14;None;max(b, c);"+max(b, c));
		
		// 出力
		System.out.println(result);
	}

}