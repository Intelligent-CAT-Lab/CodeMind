import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
System.out.println("[INST]4;A;sc.nextInt();"+A);
		int B = sc.nextInt();
System.out.println("[INST]5;B;sc.nextInt();"+B);
		
		if(A+B >= 10)
			System.out.println("error");
		else
			System.out.println(A+B);
	}
}