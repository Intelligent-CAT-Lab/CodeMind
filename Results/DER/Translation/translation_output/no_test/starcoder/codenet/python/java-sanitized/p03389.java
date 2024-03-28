import java.util.*;

public class p03389 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int[] arr = new int[]{a, b, c};
        Arrays.sort(arr);

        int s = 0;
        for (int i = 0; i < 2; i++) {
            int tmp = arr[2] - arr[i];
            s += tmp / 2;
            arr[i] += tmp / 2 * 2;
        }

        s += Arrays.stream(arr).sum() % 3;

        System.out.println(s);
    }
}