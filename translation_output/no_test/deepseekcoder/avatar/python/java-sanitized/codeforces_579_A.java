import java.util.Scanner;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 0;
        while (n != 0) {
            n >>= 1;
            x++;
        }
        System.out.println(x);
    }
}