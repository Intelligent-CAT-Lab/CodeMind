import java.util.*;
 
public class p03404 {
	static Scanner scanner = new Scanner(System.in);
 
	public static void main(String[]$) {
		int a = scanner.nextInt() - 1;
		int b = scanner.nextInt() - 1;
		char[][] grid = new char[98][99];
		for (int i = 0; i < 98; i++) {
			if (i < 49) {
				Arrays.fill(grid[i], '#');
			} else {
				Arrays.fill(grid[i], '.');
			}
		}
		for (int i = 0; i < a; i++) {
			grid[i / 49 * 2 + 1][i % 49 * 2 + 1] = '.';
		}
		for (int i = 0; i < b; i++) {
			grid[i / 49 * 2 + 50][i % 49 * 2 + 1] = '#';
		}
		System.out.println("98 99");
		Arrays.stream(grid).map(String::valueOf).forEach(System.out::println);
	}
}