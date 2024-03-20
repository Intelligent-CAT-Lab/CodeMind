import java.util.Scanner;

public class p02019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = n - (c + a - c + b - c);
        System.out.println(result);
    }
}