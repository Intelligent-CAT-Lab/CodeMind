import java.util.Scanner;

public class p03893 {
    public static void main(String[] args) {
        Integer[] g = new Integer[50];
        Integer[] h = new Integer[50];
        for (int i = 0; i < 50; i++) {
            g[i] = null;
            h[i] = null;
        }
        h[1] = 3;
        g[1] = 6;
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        scanner.close();
        for (int i = 2; i <= X; i++) {
            h[i] = g[i - 1] + 1;
            g[i] = 2 * h[i];
        }
        System.out.println(g[X]);
    }
}