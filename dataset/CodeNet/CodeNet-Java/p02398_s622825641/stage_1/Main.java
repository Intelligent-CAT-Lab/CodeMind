import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int sum=0;
		for(int i=a;i<=b;i++)
			if(c%i==0)
				sum++;
		System.out.println(sum);
	}
}