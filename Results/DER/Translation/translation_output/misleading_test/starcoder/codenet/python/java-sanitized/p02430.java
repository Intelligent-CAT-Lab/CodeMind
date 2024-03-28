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
        int count = 0;
        for (int i = 0; i < n; i++) {
            comb[count] = i;
            sum += Math.pow(2, i);
            count++;
            if (count == k) {
                count = 0;
                combs[i - k + 1] = comb.clone();
                sumlist[i - k + 1] = sum;
                sum = 0;
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