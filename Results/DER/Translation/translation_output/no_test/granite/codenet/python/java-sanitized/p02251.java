import java.util.Scanner;

public class p02251 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        ans += n / 25;
        n %= 25;
        ans += n / 10;
        n %= 10;
        ans += n / 5;
        n %= 5;
        ans += n;
        System.out.println(ans);
    }
}