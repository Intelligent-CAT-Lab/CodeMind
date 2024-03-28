import java.util.Scanner;

public class p03129 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        if (N % 2 == 0) {
            if (N / 2 >= K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            if (N / 2 + 1 >= K) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}