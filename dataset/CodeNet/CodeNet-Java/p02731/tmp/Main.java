import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double L = scan.nextInt();
System.out.println("[INST]5;L;scan.nextInt();"+L);
		scan.close();
		System.out.println(Math.pow(L/3, 3));
	}
}
