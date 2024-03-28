import java.util.Scanner;

public class p01853 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] points = new String[n];
        for (int i = n/2 + 1; i < n; i++) {
            points[i] = Integer.toString(m);
        }
        for (int i = 0; i < n/2 + 1; i++) {
            points[i] = Integer.toString(0);
        }
        System.out.println(String.join(" ", points));
    }
}