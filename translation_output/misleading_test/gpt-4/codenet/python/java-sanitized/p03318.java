import java.util.Scanner;
import java.util.stream.IntStream;

public class p03318 {
    
    public static class SunukeSolver {
        public static void solve(int k) {
            long ans = 1;
            int i = 0;
            while (k > 0) {
                System.out.println(ans);
                k--;
                if (check(ans, i)) {
                    i++;
                }
                ans += Math.pow(10, i);
            }
        }

        private static double sunuke(long a) {
            return a / (double)IntStream.of(String.valueOf(a).split(""))
                                         .mapToInt(Integer::parseInt)
                                         .sum();
        }

        private static boolean check(long a, int i) {
            return sunuke(a + (long)Math.pow(10, i)) > sunuke(a + (long)Math.pow(10, i + 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        SunukeSolver.solve(k);
        scanner.close();
    }
}