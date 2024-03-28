import java.util.Scanner;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = 1;
        while (Math.log(n) % 1 != 0) {
            x++;
            n -= Math.pow(2, Math.ceil(Math.log(n)));
        }
        System.out.println(x);
    }
}