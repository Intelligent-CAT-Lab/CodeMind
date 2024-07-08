import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 計算
		int result = 0;
var newVariable_0 = max(a, max(b, c));var newVariable_1 = max(b, c);		result = a+b+c-max(a, newVariable_1);
		
		// 出力
		System.out.println(result);
	}

}