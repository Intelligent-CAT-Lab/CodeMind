import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static double x1=sc.nextDouble();
	private static double y1=sc.nextDouble();
	private static double x2=sc.nextDouble();
	private static double y2=sc.nextDouble();
	private static double ans;
	public static void main (String[] args){
		ans=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		System.out.println(ans);
	}
}