import java.util.Scanner;
import java.lang.Math;

public class p02694 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int y = 100;
        int ans = 0;
        while (y < x) {
            ans += 1;
            y = (int) Math.floor(y * 1.01);
        }

        System.out.println(ans);
    }
}