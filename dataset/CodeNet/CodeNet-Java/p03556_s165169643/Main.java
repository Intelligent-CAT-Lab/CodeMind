import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		long n = sc.nextLong();
      	long count = 0;
      	
        for(long i = 1; i <= n; i++){
        	if(i*i<=n){
              count++;
            }
        }
              System.out.println(count*count);
     }
}