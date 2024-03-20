import java.util.Scanner;

public class p02406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] A = new int[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                A[i-1] = i;
            } else if (String.valueOf(i).contains("3")) {
                A[i-1] = i;
            }
        }

        System.out.print(" ");
        for (int i = 0; i < n-1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[n-1]);
    }
}