import java.util.Scanner;

public class p02981 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = b;
        if (n * a > b) {
            ans = n * a;
        }

        System.out.println(ans);
    }
}