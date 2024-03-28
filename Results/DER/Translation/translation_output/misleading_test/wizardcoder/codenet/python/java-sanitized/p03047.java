import java.util.Scanner;

public class p03047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        int result = N - (K - 1);
        System.out.println(result);
    }
}