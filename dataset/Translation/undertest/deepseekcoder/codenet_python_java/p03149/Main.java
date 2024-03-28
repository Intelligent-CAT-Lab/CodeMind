import java.util.Arrays;
import java.util.Scanner;

public class p03149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[4];
        int[] b = {1, 4, 7, 9};
        for (int i = 0; i < 4; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(a);
        String ans;
        if (Arrays.equals(a, b)) {
            ans = "YES";
        } else {
            ans = "NO";
        }
        System.out.println(ans);
    }
}