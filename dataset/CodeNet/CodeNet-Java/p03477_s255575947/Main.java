import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt() + sc.nextInt();
		int b = sc.nextInt() + sc.nextInt();
		System.out.println(a > b ? "Left" : a == b ? "Balanced" : "Right");
	}
}