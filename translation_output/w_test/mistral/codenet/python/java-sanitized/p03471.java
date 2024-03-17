import java.util.*;

public class p03471 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, y;
        n = sc.nextInt();
        y = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                if ((y - (i * 10000 + j * 5000)) / 1000 == (n - i - j)) {
                    System.out.println(i + " " + j + " " + (n - i - j));
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}