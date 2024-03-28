import java.util.*;
import java.io.*;

public class p02004 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<Integer> rr = new ArrayList<>();

        while (true) {
            String n = sc.nextLine();
            if (n.equals("0")) break;
            int r = 0;
            int t = 0;
            for (char c : n.toCharArray()) {
                if (c == 'R') {
                    t++;
                    if (t == 4) {
                        r++;
                        t = 0;
                    }
                } else {
                    t--;
                    if (t == -4) {
                        t = 0;
                    }
                }
            }
            rr.add(r);
        }

        for (int r : rr) {
            System.out.println(r);
        }
    }
}