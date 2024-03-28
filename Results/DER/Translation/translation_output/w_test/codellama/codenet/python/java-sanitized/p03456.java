import java.util.Scanner;

public class p03456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = a + b;
        int sqrtn = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                System.out.println("Yes");
                break;
            }
        }
        if (i > sqrtn) {
            System.out.println("No");
        }
    }
}