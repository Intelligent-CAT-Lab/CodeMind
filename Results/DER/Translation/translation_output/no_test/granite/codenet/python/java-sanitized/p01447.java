import java.util.Scanner;

public class p01447 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        int tmp = 1;
        while (n > tmp) {
            tmp *= 3;
            ans += 1;
        }
        System.out.println(ans);
    }
}