import java.util.Arrays;
import java.util.Scanner;

public class p03149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(a);

        int[] b = {1, 4, 7, 9};
        Arrays.sort(b);

        String ans;
        if (Arrays.equals(a, b)) {
            ans = "YES";
        } else {
            ans = "NO";
        }
        System.out.println(ans);
    }
}