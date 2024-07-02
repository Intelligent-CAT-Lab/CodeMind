import java.util.Scanner;
public class Main {
	public static void calcu(int a,int b){
		int ans=a;
		while(b!=0){
			ans = a % b; 
			a = b; 
			b = ans; 
		}
		System.out.println(a);
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
System.out.println("[INST]13;a;scan.nextInt();"+a);
		int b = scan.nextInt();
System.out.println("[INST]14;b;scan.nextInt();"+b);
		if(a>b)
			calcu(a,b);
		else
			calcu(b,a);
	}

}