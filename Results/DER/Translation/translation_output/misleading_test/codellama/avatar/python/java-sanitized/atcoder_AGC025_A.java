import java.util.Scanner;

public class atcoder_AGC025_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int ans = Integer.MAX_VALUE;
        for (int a = 1; a < N; a++) {
            int b = N - a;
            ans = Math.min(ans, dsum(a) + dsum(b));
        }
        System.out.println(ans);
    }

    private static int dsum(int x) {
        return sum(map(Integer.parseInt, list(String.valueOf(x))));
    }

    private static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    private static int[] map(int[] arr, int[] func) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = func[arr[i]];
        }
        return result;
    }

    private static int[] list(String str) {
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        return arr;
    }
}