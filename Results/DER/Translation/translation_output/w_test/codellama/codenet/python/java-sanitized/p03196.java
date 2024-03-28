import java.util.Scanner;

public class p03196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[][] arr = factorization(p);
        int ans = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][1] >= n) {
                ans *= Math.pow(arr[i][0], arr[i][1] / n);
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
                arr[i][0] = i;
                arr[i][1] = cnt;
            }
        }
        if (temp != 1) {
            arr[temp][0] = temp;
            arr[temp][1] = 1;
        }
        return arr;
    }
}