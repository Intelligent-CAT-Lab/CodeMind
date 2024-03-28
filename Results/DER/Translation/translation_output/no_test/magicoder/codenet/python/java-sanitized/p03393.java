import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char tmp = (char) (i + 'a');
                if (!s.contains(String.valueOf(tmp))) {
                    System.out.println(s + tmp);
                    System.exit(0);
                }
            }
        } else {
            for (int i = s.length() - 1; i >= 0; i--) {
                for (int j = s.charAt(i) + 1; j <= 'z'; j++) {
                    if (!s.substring(0, i).contains(String.valueOf((char) j))) {
                        System.out.println(s.substring(0, i) + (char) j);
                        System.exit(0);
                    }
                }
            }
            System.out.println(-1);
            System.exit(0);
        }
    }
}