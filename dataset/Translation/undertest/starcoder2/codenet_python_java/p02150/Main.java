import java.util.Scanner;

public class p02150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int d = a - b;
        int n = Math.max(0, (x - b)) / d;
        int ans = (x + n * b) % 1000000007;
        System.out.println(ans);
    }
}