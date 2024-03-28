import java.util.Scanner;
import java.util.Arrays;

public class p04005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int[] l = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            l[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(l);
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (l[i] % 2 == 0) {
                ans = 0;
                break;
            } else {
                ans = l[0] * l[1];
            }
        }
        System.out.println(ans);
    }
}