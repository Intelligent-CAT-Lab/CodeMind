import java.util.Scanner;

public class p02983 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        scanner.close();

        if (R - L > 2019) {
            System.out.println(0);
        } else {
            int minModulo = 2019; // Starting high because we're looking for the minimum.
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    minModulo = Math.min(minModulo, (i * j) % 2019);
                }
            }
            System.out.println(minModulo);
        }
    }
}