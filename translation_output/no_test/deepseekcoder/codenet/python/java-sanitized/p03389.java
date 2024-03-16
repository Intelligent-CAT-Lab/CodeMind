import java.util.Arrays;
import java.util.Scanner;

public class p03389 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];
        arr[0] = scanner.nextInt();
        arr[1] = scanner.nextInt();
        arr[2] = scanner.nextInt();

        Arrays.sort(arr);
        int s = 0;

        for (int i = 0; i < 2; i++) {
            int tmp = arr[2] - arr[i];
            s += tmp / 2;
            arr[i] += (tmp / 2) * 2;
        }

        s += arr[0] % 3 + arr[1] % 3 + arr[2] % 3;

        System.out.println(s);
    }
}