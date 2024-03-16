import java.util.Scanner;

public class p03666 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }
        int N = nums[0], A = nums[1], B = nums[2], C = nums[3], D = nums[4];
        for (int k = 0; k <= N; k++) {
            int j = N - k;
            if (D * k - C * j >= B - A && B - A >= C * k - D * j) {
                System.out.println("YES");
                break;
            }
        } else {
            System.out.println("NO");
        }
    }
}