import java.util.Scanner;

public class p02406 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                A[i] = i;
            } else if (String.valueOf(i).contains("3")) {
                A[i] = i;
            }
        }
        System.out.print(" ");
        for (int i = 0; i < A.length - 1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[A.length - 1]);
    }
}