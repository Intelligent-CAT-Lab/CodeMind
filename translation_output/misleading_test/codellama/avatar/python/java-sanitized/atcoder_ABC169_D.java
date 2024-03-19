import java.util.Scanner;

public class atcoder_ABC169_D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[][] factors = factorization(x);
        int ans = 0;
        for (int i = 0; i < factors.length; i++) {
            int prime = factors[i][0];
            int power = factors[i][1];
            if (prime == 1) {
                continue;
            } else {
                int s = 0;
                int num = power;
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
        int[][] arr = new int[n][2];
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr[i] = new int[] { i, cnt };
            }
        }
        if (temp != 1) {
            arr[temp] = new int[] { temp, 1 };
        }
        if (arr.length == 0) {
            arr[n] = new int[] { n, 1 };
        }
        return arr;
    }
}