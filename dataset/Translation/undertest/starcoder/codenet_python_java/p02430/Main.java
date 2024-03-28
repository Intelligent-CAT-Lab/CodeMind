import java.util.Scanner;

public class p02430 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = i;
        }
        int[][] combs = new int[n - k + 1][k];
        int[] sumlist = new int[n - k + 1];
        int[] comb = new int[k];
        int sum = 0;
        for (int i = 0; i < n - k + 1; i++) {
            for (int j = 0; j < k; j++) {
                comb[j] = l[i + j];
                sum += Math.pow(2, comb[j]);
            }
            sumlist[i] = sum;
            for (int j = 0; j < k; j++) {
                combs[i][j] = comb[j];
            }
        }
        for (int i = 0; i < n - k + 1; i++) {
            System.out.print(sumlist[i] + ": ");
            for (int j = 0; j < k; j++) {
                System.out.print(combs[i][j] + " ");
            }
            System.out.println();
        }
    }
}