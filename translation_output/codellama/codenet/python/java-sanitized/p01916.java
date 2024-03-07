import java.util.Scanner;

public class p01916 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            }
        }
        int ans = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] % 2 == 1) {
                ans++;
            }
        }
        System.out.println(ans / 2);
    }
}