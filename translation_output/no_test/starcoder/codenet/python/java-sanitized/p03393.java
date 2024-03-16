import java.util.*;
import java.io.*;

public class p03393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char c = (char) ('a' + i);
                if (!s.contains(c + "")) {
                    System.out.println(s + c);
                    return;
                }
            }
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {
                for (int j = (int) s.charAt(i) + 1; j < 'z' + 1; j++) {
                    if (!s.contains((char) j + "")) {
                        System.out.println(s.substring(0, i) + (char) j);
                        return;
                    }
                }
            }
            System.out.println(-1);
        }
    }
}