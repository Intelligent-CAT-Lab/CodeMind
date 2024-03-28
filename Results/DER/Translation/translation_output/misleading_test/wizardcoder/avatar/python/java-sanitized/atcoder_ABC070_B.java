import java.util.Scanner;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int maxAB = Math.max(a, b);
        int minCD = Math.min(c, d);
        int result = Math.max(0, minCD - maxAB);
        System.out.println(result);
    }
}