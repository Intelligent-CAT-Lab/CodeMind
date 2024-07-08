import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		
		// 計算
		int result = 0;
		int[][] array = new int[10][10];
		for(int i = 1; i <= n; i++){
var newVariable_0 = String.valueOf(i).substring(0,1);var newVariable_1 = String.valueOf(i);		    int head = Integer.valueOf(newVariable_1.substring(0,1));
		    int tail = i%10;
		    array[head][tail]++;
		}
		
var newVariable_2 = String.valueOf(n);		int keta = newVariable_2.length();
		for(int i = 1; i <= n; i++){
var newVariable_3 = String.valueOf(i).substring(0,1);var newVariable_4 = String.valueOf(i);		    int head = Integer.valueOf(newVariable_4.substring(0,1));
		    int tail = i%10;
		    if(tail == 0) continue;
		    result += array[tail][head];
		}
		
		// 出力
		System.out.println(result);
	}
}


