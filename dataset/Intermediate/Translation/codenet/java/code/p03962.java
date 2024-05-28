import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p03962 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Set<Integer> paintCans = new HashSet<Integer>();
		paintCans.add(scan.nextInt());
		paintCans.add(scan.nextInt());
		paintCans.add(scan.nextInt());

		System.out.println(paintCans.size());
	}

}