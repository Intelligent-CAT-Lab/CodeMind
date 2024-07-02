import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int a = sc.nextInt();
System.out.println("[INST]6;a;sc.nextInt();"+a);
		int b = sc.nextInt();
System.out.println("[INST]7;b;sc.nextInt();"+b);
  
		// 出力
		System.out.println(a * b - (a + b - 1));
	}
}
