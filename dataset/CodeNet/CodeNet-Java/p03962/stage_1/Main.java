import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Set<Integer> paintCans = new HashSet<Integer>();
var newVariable_0 = paintCans.add(scan.nextInt());var newVariable_1 = scan.nextInt();		paintCans.add(newVariable_1);
var newVariable_2 = paintCans.add(scan.nextInt());var newVariable_3 = scan.nextInt();		paintCans.add(newVariable_3);
var newVariable_4 = paintCans.add(scan.nextInt());var newVariable_5 = scan.nextInt();		paintCans.add(newVariable_5);

		System.out.println(paintCans.size());
	}

}