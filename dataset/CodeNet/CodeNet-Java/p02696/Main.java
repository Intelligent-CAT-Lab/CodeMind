import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long n=sc.nextLong();
		if(n>=b){
			System.out.println(a*(b-1)/b);
		}else{
			System.out.println(a*n/b);
		}
	}
}