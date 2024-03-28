import java.util.Scanner;

public class p03789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = String.valueOf(scanner.nextInt());
        char[] arr = n.toCharArray();
        int lb = 0, ub = arr.length;
        while (ub - lb > 1) {
            int mid = (lb + ub) / 2;
            if (check(arr, mid)) {
                ub = mid;
            } else {
                lb = mid;
            }
        }
        System.out.println(ub);
    }

    private static boolean check(char[] arr, int mid) {
        int x = 0;
        int g = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            x -= (x + g - (arr[i] - '0')) % 10;
            if (x < 0) {
                break;
            }
            g = (x + g) / 10;
        }
        return x >= 0;
    }
}