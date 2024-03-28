import java.util.Scanner;

public class p02406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0) {
                A[i] = i;
            } else if (String.valueOf(i).contains("3")) {
                A[i] = i;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i] != 0) {
                System.out.print(A[i] + " ");
            }
        }
    }
}