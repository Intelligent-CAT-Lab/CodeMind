import java.util.Scanner;
class Main {
	public static void main(String[]args){
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
System.out.println("[INST]4;a;stdIn.nextInt();"+a);
		int b = stdIn.nextInt();
System.out.println("[INST]5;b;stdIn.nextInt();"+b);
		if(a==1){
			if(b!=1){
				System.out.println("Alice");
			}
		}
		if(b==1){
			if(a!=1){
				System.out.println("Bob");
			}
		}
		 	
		if((a>b)&&(a!=1)&&(b!=1)) System.out.println("Alice");
		if((a<b)&&(a!=1)&&(b!=1)) System.out.println("Bob");
		if(a==b) System.out.println("Draw");
	}
}