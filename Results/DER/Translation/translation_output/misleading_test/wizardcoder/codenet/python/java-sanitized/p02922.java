import java.util.Scanner;

public class p02922 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 1;
        int ans = 0;

        while (total < b) {
            ans += 1;
            total += a - 1;
        }

        System.out.println(ans);
    }
}