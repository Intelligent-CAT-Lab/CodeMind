import java.util.Scanner;

public class p03324 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int N = sc.nextInt();
        if (N != 100) {
            System.out.println(Math.pow(100, D) * N);
        } else {
            System.out.println(Math.pow(100, D) * (N + 1));
        }
    }
}