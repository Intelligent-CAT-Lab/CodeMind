import java.util.Scanner;

public class Main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int max=0;

		if(a*10+b+c>max){
			max=a*10+b+c;
		}
		if(a+b*10+c>max){
			max=a+b*10+c;
		}
		if(a+b+c*10>max){
			max=a+b+c*10;
		}
		System.out.println(max);


	}

}
