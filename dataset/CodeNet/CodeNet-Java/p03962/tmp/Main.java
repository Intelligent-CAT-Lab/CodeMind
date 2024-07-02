import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Set<Integer> paintCans = new HashSet<Integer>();
		paintCans.add(scan.nextInt());
System.out.println("[INST]10;None;paintCans.add(scan.nextInt());"+paintCans.add(scan.nextInt()));
System.out.println("[INST]10;None;scan.nextInt();"+scan.nextInt());
		paintCans.add(scan.nextInt());
System.out.println("[INST]11;None;paintCans.add(scan.nextInt());"+paintCans.add(scan.nextInt()));
System.out.println("[INST]11;None;scan.nextInt();"+scan.nextInt());
		paintCans.add(scan.nextInt());
System.out.println("[INST]12;None;paintCans.add(scan.nextInt());"+paintCans.add(scan.nextInt()));
System.out.println("[INST]12;None;scan.nextInt();"+scan.nextInt());

		System.out.println(paintCans.size());
	}

}