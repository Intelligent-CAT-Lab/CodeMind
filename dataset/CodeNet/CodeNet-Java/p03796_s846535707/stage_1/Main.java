import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	
      	long total = 1L;
      	for(int i = 1; i <= N; i++){
        	total = (total * i) % 1000000007;
        }
      	System.out.println(total);
    }
}