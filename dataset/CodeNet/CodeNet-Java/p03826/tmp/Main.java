import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt()*sc.nextInt(),b=sc.nextInt()*sc.nextInt();
System.out.println("[INST]4;None;sc.nextInt();"+sc.nextInt());
System.out.println("[INST]4;None;sc.nextInt();"+sc.nextInt());
System.out.println("[INST]4;None;sc.nextInt();"+sc.nextInt());
System.out.println("[INST]4;None;sc.nextInt();"+sc.nextInt());
		System.out.println((a<b)?b:a);
		sc.close();
	}
}