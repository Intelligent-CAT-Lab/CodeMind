import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println((sc.nextInt() * 0 + sc.nextInt() + sc.nextInt()) % 2 == 0 ? "Alice" : "Borys");
	}
}