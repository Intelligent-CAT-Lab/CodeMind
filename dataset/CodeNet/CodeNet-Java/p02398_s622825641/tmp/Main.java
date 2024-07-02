import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
System.out.println("[INST]4;a;in.nextInt();"+a);
		int b=in.nextInt();
System.out.println("[INST]5;b;in.nextInt();"+b);
		int c=in.nextInt();
System.out.println("[INST]6;c;in.nextInt();"+c);
		int sum=0;
		for(int i=a;i<=b;i++)
			if(c%i==0)
				sum++;
		System.out.println(sum);
	}
}