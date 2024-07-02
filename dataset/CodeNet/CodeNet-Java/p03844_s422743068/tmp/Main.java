import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
System.out.println("[INST]6;a;sc.nextInt();"+a);
		String op = sc.next();
System.out.println("[INST]7;op;sc.next();"+op);
		int b = sc.nextInt();
System.out.println("[INST]8;b;sc.nextInt();"+b);
		if(op.equals("+")){
System.out.println("[INST]9;None;op.equals('+');"+op.equals("+"));
			System.out.println(a+b);
		}else{
			System.out.println(a-b);
		}
	}
}
