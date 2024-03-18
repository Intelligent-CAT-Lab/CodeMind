import java.util.Scanner;

public class p03893 {
    public static void main(String[] args) {
        int[] g = new int[50];
        int[] h = new int[50];
        h[1] = 3;
        g[1] = 6;
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        for (int i = 2; i <= X; i++) {
            h[i] = g[i - 1] + 1;
            g[i] = 2 * h[i];
        }
        System.out.println(g[X]);
        scanner.close();
    }
}