import java.util.*;

public class p01853 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] points = new String[n];
        Arrays.fill(points, "0");
        for (int i = n / 2 + 1; i < n; i++) {
            points[i] = String.valueOf(m);
        }
        System.out.println(Arrays.toString(points));
    }
}