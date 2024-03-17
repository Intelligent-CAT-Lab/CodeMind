import java.util.*;
public class p03799 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (2 * n <= m) {
            System.out.println(n + (m - 2 * n) / 4);
        } else {
            System.out.println(m / 2);
        }
    }
}