import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String op = sc.next();
		int b = sc.nextInt();
		if(op.equals("+")){
			System.out.println(a+b);
		}else{
			System.out.println(a-b);
		}
	}
}
