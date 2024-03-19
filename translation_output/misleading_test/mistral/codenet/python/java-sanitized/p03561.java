import java.util.*;

public class p03561 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        if (sum % 2 == 0) {
            System.out.println(Arrays.stream(arr).sum() / 2 + Arrays.stream(arr).skip(1).limit(N - 1).sum());
        } else {
            int mid = N / 2;
            int[] temp = new int[N];
            for (int i = 0; i < N; i++) {
                temp[i] = arr[i];
            }
            for (int i = mid; i < N; i++) {
                temp[i] = temp[i - mid] - 1;
            }
            for (int i = 0; i < mid; i++) {
                if (temp[i] == 1) {
                    temp[i] = 0;
                }
            }
            System.out.println(Arrays.stream(temp).sum());
        }
    }
}