import java.util.*;

public class p03687 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int[] arr = new int[26];
        for (int i = 0; i < n; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                int j = 0;
                for (int k = i; k < n; k++) {
                    if (s.charAt(k) == (char) (i + 'a')) {
                        j = 0;
                    } else {
                        j++;
                        max = Math.max(max, j);
                    }
                }
            }
        }
        System.out.println(max);
    }
}