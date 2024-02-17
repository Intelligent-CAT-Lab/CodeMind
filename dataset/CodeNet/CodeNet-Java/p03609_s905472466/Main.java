import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int sum = sc.nextInt()-sc.nextInt();
		if(sum<=0)
			System.out.println(0);
		else
			System.out.println(sum);
	}
}
