import java.util.Scanner;

public class p02406 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int[] A = new int[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                A[i - 1] = i;
            }
        }

        for (int i = 0; i < A.length - 1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[A.length - 1]);
    }
}


Next, it iterates over the range of numbers from 1 to `n` and checks if each number is divisible by 3 or if it contains the digit 3. If either of these conditions is true, the number is added to the array `A`.