import java.util.Arrays;
import java.util.Scanner;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int[] arr = new int[0];
        int temp = x;
        for (int i = 2; i <= Math.ceil(Math.sqrt(-x)); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr = new int[]{i, cnt};
            }
        }
        if (temp != 1) {
            arr = new int[]{temp, 1};
        }
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][0] == 1) {
                continue;
            } else {
                int s = 0;
                int num = arr[i][1];
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
}