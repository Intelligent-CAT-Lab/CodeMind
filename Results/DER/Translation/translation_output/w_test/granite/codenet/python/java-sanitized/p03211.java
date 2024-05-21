import java.util.*;

public class p03211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int a = 99999;
        for (int i = 0; i < S.length() - 2; i++) {
            int num = Integer.parseInt(S.substring(i, i + 3));
            int diff = Math.abs(753 - num);
            if (diff < a) {
                a = diff;
            }
        }
        System.out.println(a);
    }
}