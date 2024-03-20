import java.util.Scanner;

public class p03337 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a+b, Math.max(a-b, a*b));
        System.out.println(max);
    }
}