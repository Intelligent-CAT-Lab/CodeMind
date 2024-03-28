import java.util.Scanner;
import java.lang.Math;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while (Math.log2(n) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int) Math.log2(n));
        }
        System.out.println(x);
    }
}