import java.util.Scanner;

public class p03107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int N = input.length();

        int C0 = 0;
        int C1 = 0;

        for (int i = 0; i < N; i++) {
            if (input.charAt(i) == '0') {
                C0++;
            } else {
                C1++;
            }
        }

        System.out.println(2 * Math.min(C0, C1));
    }
}