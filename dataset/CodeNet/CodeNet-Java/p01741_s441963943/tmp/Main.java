import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = Double.parseDouble(sc.next());
System.out.println("[INST]4;d;Double.parseDouble(sc.next());"+d);
System.out.println("[INST]4;None;sc.next();"+sc.next());
		double e = (int)d + 1;
		e = Math.max(e, d / Math.sqrt(2) * 2);
System.out.println("[INST]6;e;Math.max(e, d / Math.sqrt(2) * 2);"+e);
System.out.println("[INST]6;None;Math.sqrt(2);"+Math.sqrt(2));
		System.out.println(e);
	}
}
