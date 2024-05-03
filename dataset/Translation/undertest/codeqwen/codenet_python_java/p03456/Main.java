import java.util.Scanner;
import java.lang.Math;

public class p03456 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int n = Integer.parseInt(a + b);
        int sqrtn = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}