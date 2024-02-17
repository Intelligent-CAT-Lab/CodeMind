import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
	long b = sc.nextLong();
	long x = sc.nextLong();
	long count=0;
	if(x>=a){
		long figure = (x-a)/(a-b)+1;
		count = x%1000000007+(figure%1000000007)*(b%1000000007);
		System.out.println(count%1000000007);
	}else System.out.println(x%1000000007);
    }
}

