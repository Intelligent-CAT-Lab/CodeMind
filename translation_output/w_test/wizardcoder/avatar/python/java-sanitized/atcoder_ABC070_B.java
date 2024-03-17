import java.util.Scanner;

public class atcoder_ABC070_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int max_ab = Math.max(a, b);
        int min_cd = Math.min(c, d);
        int result = Math.max(0, min_cd - max_ab);
        System.out.println(result);
    }
}