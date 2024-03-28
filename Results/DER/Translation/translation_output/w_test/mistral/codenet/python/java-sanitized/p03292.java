import java.util.Scanner;

public class p03292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] A = new int[3];
        for (int i = 0; i < 3; i++) {
            A[i] = scanner.nextInt();
        }
        int b = Math.abs(A[0] - A[1]) + Math.abs(A[0] - A[2]);
        int c = Math.abs(A[0] - A[1]) + Math.abs(A[1] - A[2]);
        int d = Math.abs(A[0] - A[2]) + Math.abs(A[1] - A[2]);
        int min = Math.min(b, c, d);
        System.out.println(min);
    }
}