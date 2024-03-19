import java.util.Scanner;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while ((Math.log10(n) / Math.log10(2)) % 1 != 0) {
            x += 1;
            n -= Math.pow(2, (int) (Math.log10(n) / Math.log10(2)));
        }
        System.out.println(x);
    }
}