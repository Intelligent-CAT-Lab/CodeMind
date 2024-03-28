import java.util.Scanner;

public class p02729 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int even = n * (n - 1) / 2;
        int odd = m * (m - 1) / 2;
        System.out.println(even + odd);
    }
}