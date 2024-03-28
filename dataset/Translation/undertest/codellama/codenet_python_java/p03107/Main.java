import java.util.Scanner;

public class p03107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] A = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            A[i] = input.charAt(i) - '0';
        }
        int N = A.length;
        int C0 = 0, C1 = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                C0++;
            } else {
                C1++;
            }
        }
        System.out.println(2 * Math.min(C0, C1));
    }
}