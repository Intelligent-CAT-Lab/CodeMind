import java.util.Scanner;

public class p03059 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int t = sc.nextInt();
        int result = (t / a) * b;
        System.out.println(result);
    }
}