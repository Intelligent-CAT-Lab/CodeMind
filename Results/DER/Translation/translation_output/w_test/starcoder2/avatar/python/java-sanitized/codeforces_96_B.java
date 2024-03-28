import java.util.*;
public class codeforces_96_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[10000000000];
        int limit = 10000000000;
        int four = 0;
        int seven = 0;
        int number = 0;
        int ans = 0;
        for (int i = 0; i < l.length; i++) {
            if (number > limit) {
                break;
            }
            if (number > 0 && four == seven) {
                l[i] = number;
            }
            gen(number * 10 + 4, four + 1, seven);
            gen(number * 10 + 7, four, seven + 1);
        }
        Arrays.sort(l);
        for (int i = 0; i < l.length; i++) {
            if (l[i] >= n) {
                ans = l[i];
                break;
            }
        }
        System.out.println(ans);
    }
}