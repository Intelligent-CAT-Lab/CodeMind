import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static double x1=sc.nextDouble();
System.out.println("[INST]4;x1;sc.nextDouble();"+x1);
	private static double y1=sc.nextDouble();
System.out.println("[INST]5;y1;sc.nextDouble();"+y1);
	private static double x2=sc.nextDouble();
System.out.println("[INST]6;x2;sc.nextDouble();"+x2);
	private static double y2=sc.nextDouble();
System.out.println("[INST]7;y2;sc.nextDouble();"+y2);
	private static double ans;
	public static void main (String[] args){
		ans=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
System.out.println("[INST]10;ans;Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));"+ans);
		System.out.println(ans);
	}
}