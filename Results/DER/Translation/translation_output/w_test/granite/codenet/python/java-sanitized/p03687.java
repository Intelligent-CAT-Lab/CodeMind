import java.util.*;

public class p03687 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] count = new int[26];
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            max = Math.max(max, count[s.charAt(i) - 'a']);
        }
        System.out.println(max);
    }
}