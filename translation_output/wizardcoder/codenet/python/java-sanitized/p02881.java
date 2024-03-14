import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] ij = ij(n);
        System.out.println(ij[0] + ij[1] - 2);
    }

    public static int[] ij(int n) {
        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                return new int[]{i, n/i};
            }
        }
        return new int[]{0, 0};
    }
}