import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] ij = getIJ(n);
        System.out.println(ij[0] + ij[1] - 2);
    }

    public static int[] getIJ(int n) {
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                int j = n / i;
                if (j == i) {
                    return new int[]{i, j};
                }
            }
            i++;
        }
        return new int[]{0, 0};
    }
}