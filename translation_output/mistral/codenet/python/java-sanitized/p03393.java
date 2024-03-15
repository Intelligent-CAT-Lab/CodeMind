import java.util.*;
import java.io.*;

public class p03393 {
    static Scanner sc = new Scanner(System.in);
    static String s;
    static char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) throws IOException {
        s = sc.nextLine();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char c = chars[i];
                if (!s.contains(c)) {
                    System.out.println(s + c);
                    System.exit(0);
                }
            }
        } else {
            for (int i = 25; i >= 0; i--) {
                for (int j = ord(s.charAt(i)) + 1; j <= ord('z'); j++) {
                    char c = (char) (j);
                    if (!s.substring(0, i).contains(c)) {
                        System.out.println(s.substring(0, i) + c);
                        System.exit(0);
                    }
                }
            }
            System.out.println(-1);
            System.exit(0);
        }
    }
}