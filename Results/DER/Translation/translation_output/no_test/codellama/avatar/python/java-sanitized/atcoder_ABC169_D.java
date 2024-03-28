import java.util.Scanner;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[][] factors = factorization(x);
        int[][] sortedFactors = sortFactors(factors);
        int ans = 0;
        for (int i = 0; i < sortedFactors.length; i++) {
            if (sortedFactors[i][0] == 1) {
                continue;
            } else {
                int s = 0;
                int num = sortedFactors[i][1];
                if (num == 1) {
                    int j = 1;
                } else {
                    for (int j = 1; j <= num; j++) {
                        s += j;
                        if (s == num) {
                            break;
                        } else if (s > num) {
                            j--;
                            break;
                        }
                    }
                }
                ans += j;
            }
        }
        System.out.println(ans);
    }

    public static int[][] factorization(int n) {
        int[][] factors = new int[n][2];
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                factors[i] = new int[] { i, cnt };
            }
        }
        if (temp != 1) {
            factors[temp] = new int[] { temp, 1 };
        }
        return factors;
    }

    public static int[][] sortFactors(int[][] factors) {
        int[][] sortedFactors = new int[factors.length][2];
        for (int i = 0; i < factors.length; i++) {
            sortedFactors[i] = factors[i];
        }
        Arrays.sort(sortedFactors, (a, b) -> a[0] - b[0]);
        return sortedFactors;
    }
}