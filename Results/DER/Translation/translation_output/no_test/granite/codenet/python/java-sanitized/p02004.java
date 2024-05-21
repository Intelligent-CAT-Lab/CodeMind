import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if (s.equals("0")) {
                break;
            }
            int count = 0;
            int t = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'R') {
                    t++;
                    if (t == 4) {
                        count++;
                        t = 0;
                    }
                } else {
                    t--;
                    if (t == -4) {
                        t = 0;
                    }
                }
            }
            System.out.println(count);
        }
    }
}