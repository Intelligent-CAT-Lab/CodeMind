import java.util.Scanner;
public class p00356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a + b - (int) Math.gcd(a, b) + 1;
        System.out.println(result);
    }
}