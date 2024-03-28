import java.util.*;

class Main {
    static Scanner sc = new Scanner(System.in);
    static int[] dic = new int[26];
    public static void main(String[] args) {
        String S = sc.next();
        for (int i = 0; i < S.length(); ++i) {
            dic[S.charAt(i) - 'a']++;
        }
        int ans = 0;
        for (int i = 0; i < 26; ++i) {
            if (dic[i] % 2 == 1) ans++;
        }
        System.out.println(ans / 2);
    }
}