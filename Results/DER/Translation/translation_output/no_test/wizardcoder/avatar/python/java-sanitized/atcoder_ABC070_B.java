import java.util.Scanner;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        int max1 = Math.max(0, Math.min(b, d) - Math.max(a, c));
        System.out.println(max1);
    }
}