import java.util.Scanner;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while ((int) Math.log(n) % 1 != 0) {
            x++;
            n -= (int) Math.pow(2, (int) Math.log(n));
        }
        System.out.println(x);
    }
}