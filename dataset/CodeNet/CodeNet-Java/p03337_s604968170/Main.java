import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		int add = a+b;
		int sub = a-b;
		int p = a*b;
		if(add >= sub && add >= p) {
			System.out.print(add);
		}else if (sub >= add && sub >= p) {
			System.out.print(sub);
		}else {
			System.out.print(p);
		}
		System.out.print("");
	
		in.close();
		
	}
}
