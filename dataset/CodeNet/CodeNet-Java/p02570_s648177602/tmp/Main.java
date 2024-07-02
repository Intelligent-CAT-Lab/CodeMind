import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		double d = sc.nextInt();
System.out.println("[INST]5;d;sc.nextInt();"+d);
      double t = sc.nextDouble();
System.out.println("[INST]6;t;sc.nextDouble();"+t);
      double s = sc.nextInt();
System.out.println("[INST]7;s;sc.nextInt();"+s);

      double kakaruhun = Math.ceil(d/s);
System.out.println("[INST]9;kakaruhun;Math.ceil(d/s);"+kakaruhun);

		if(kakaruhun <= t){
			// 出力
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}