import java.util.Scanner;

public class p01853 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] points = new int[n];
        for (int i = n / 2 + 1; i < n; i++) {
            points[i] = m;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(points[i] + " ");
        }
    }
}