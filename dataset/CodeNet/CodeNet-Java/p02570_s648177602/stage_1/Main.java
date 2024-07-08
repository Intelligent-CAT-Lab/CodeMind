import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力(スペース改行関係なし)
		double d = sc.nextInt();
      double t = sc.nextDouble();
      double s = sc.nextInt();

      double kakaruhun = Math.ceil(d/s);

		if(kakaruhun <= t){
			// 出力
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		
	}
}