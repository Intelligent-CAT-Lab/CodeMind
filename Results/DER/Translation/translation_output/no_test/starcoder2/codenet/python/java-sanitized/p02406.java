import java.util.Scanner;

public class p02406 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                A[count] = i;
                count++;
            }
        }
        System.out.print(" ");
        for (int i = 0; i < count - 1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[count - 1]);
    }
}