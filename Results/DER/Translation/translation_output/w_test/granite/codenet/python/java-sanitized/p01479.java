import java.util.*;

public class p01479 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0, c = 0, p = 0;
        char b ='';
        String r = "";
        while (i < s.length()) {
            if (s.charAt(i) == b) {
                if (c > p) {
                    r = String.valueOf(b);
                    p = c;
                }
                c = 0;
            }
            b = s.charAt(i);
            i += (b == 'c')? 3 : 7;
            c += 1;
        }
        if (c > p) {
            r = String.valueOf(b);
        }
        System.out.println((r.equals("e"))? "egg" : "chicken");
    }
}