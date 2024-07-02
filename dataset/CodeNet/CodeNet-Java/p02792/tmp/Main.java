import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
System.out.println("[INST]9;n;sc.nextInt();"+n);
		
		// 計算
		int result = 0;
		int[][] array = new int[10][10];
		for(int i = 1; i <= n; i++){
		    int head = Integer.valueOf(String.valueOf(i).substring(0,1));
System.out.println("[INST]15;head;Integer.valueOf(String.valueOf(i).substring(0,1));"+head);
System.out.println("[INST]15;None;String.valueOf(i).substring(0,1);"+String.valueOf(i).substring(0,1));
System.out.println("[INST]15;None;String.valueOf(i);"+String.valueOf(i));
		    int tail = i%10;
		    array[head][tail]++;
		}
		
		int keta = String.valueOf(n).length();
System.out.println("[INST]20;keta;String.valueOf(n).length();"+keta);
System.out.println("[INST]20;None;String.valueOf(n);"+String.valueOf(n));
		for(int i = 1; i <= n; i++){
		    int head = Integer.valueOf(String.valueOf(i).substring(0,1));
System.out.println("[INST]22;head;Integer.valueOf(String.valueOf(i).substring(0,1));"+head);
System.out.println("[INST]22;None;String.valueOf(i).substring(0,1);"+String.valueOf(i).substring(0,1));
System.out.println("[INST]22;None;String.valueOf(i);"+String.valueOf(i));
		    int tail = i%10;
		    if(tail == 0) continue;
		    result += array[tail][head];
		}
		
		// 出力
		System.out.println(result);
	}
}


