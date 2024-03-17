import java.util.Scanner;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[][] factors = factorization(x);
        int ans = 0;
        for (int i = 0; i < factors.length; i++) {
            if (factors[i][0] == 1) {
                continue;
            } else {
                int num = factors[i][1];
                int j = 1;
                if (num == 1) {
                    j = 1;
                } else {
                    for (int j = 1; j < num; j++) {
                        if (j * (j + 1) / 2 == num) {
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
        if (factors.length == 0) {
            factors[n] = new int[] { n, 1 };
        }
        return factors;
    }
}