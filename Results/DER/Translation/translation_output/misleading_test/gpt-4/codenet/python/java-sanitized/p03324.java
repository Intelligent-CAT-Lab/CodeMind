import java.util.Scanner;

public class p03324 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int N = scanner.nextInt();

        System.out.println(N != 100 ? (int) Math.pow(100, D) * N : (int) Math.pow(100, D) * (N + 1));
    }

}