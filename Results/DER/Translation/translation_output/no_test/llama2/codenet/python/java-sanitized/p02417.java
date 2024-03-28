import java.util.Scanner;

public class p02417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        char[] chars = S.toCharArray();
        int[] count = new int[26];
        for (char c : chars) {
            if ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z') {
                count[c - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.print(String.valueOf((char) (97 + i)));
                System.out.print(":");
                System.out.println(count[i]);
            } else {
                System.out.print(String.valueOf((char) (97 + i)));
                System.out.print(":");
                System.out.println(0);
            }
        }
    }
}