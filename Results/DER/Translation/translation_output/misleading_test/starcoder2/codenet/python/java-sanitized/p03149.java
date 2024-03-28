import java.util.Scanner;

public class p03149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = {1, 4, 7, 9};
        String ans = "YES";
        for (int i = 0; i < 4; i++) {
            if (a[i] != b[i]) {
                ans = "NO";
                break;
            }
        }
        System.out.println(ans);
    }
}