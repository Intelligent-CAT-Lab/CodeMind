import java.util.Scanner;
import java.util.Arrays;

public class p03149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int[] b = {1, 4, 7, 9};
        String ans = "NO";
        if (Arrays.equals(a, b)) {
            ans = "YES";
        }
        System.out.println(ans);
    }
}