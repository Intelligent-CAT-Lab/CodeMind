import java.util.Scanner;

public class p02338 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if (N <= K) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}