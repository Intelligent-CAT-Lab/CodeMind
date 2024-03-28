import java.util.Scanner;

public class p03238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Hello World");
            return;
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
    }
}