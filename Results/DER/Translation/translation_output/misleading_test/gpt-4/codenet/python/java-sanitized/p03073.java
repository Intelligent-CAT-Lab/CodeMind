import java.util.Scanner;

public class p03073 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine().trim();

        int N = S.length();

        int zeroStart = 0;
        int zeroStartCounter = 0;
        for (int i = 0; i < N; i++) {
            if (zeroStart != Character.getNumericValue(S.charAt(i))) {
                zeroStartCounter++;
            }
            zeroStart = (zeroStart + 1) % 2;
        }

        int oneStartCounter = N - zeroStartCounter;

        System.out.println(Math.min(zeroStartCounter, oneStartCounter));
    }
}