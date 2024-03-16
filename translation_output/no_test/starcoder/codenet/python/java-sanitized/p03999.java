import java.util.*;
public class p03999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < (1 << (s.length() - 1)); i++) {
            String pat = s.charAt(0) + "";
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if (((i >> j) & 1) == 1) {
                    pat += "+";
                }
                pat += s.charAt(index);
                index++;
            }
            // System.out.println(pat);
            ans += eval(pat);
        }
        System.out.println(ans);
    }

    public static int eval(String s) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < s.length())? s.charAt(pos) : -1;
            }

            boolean eat(int charToEat) {
                while (ch =='') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            int parse() {
                nextChar();
                int x = eat('+')? parse() : 0;
                for (; ; ) {
                    if (eat('+')) x += parse();
                    else if (eat('-')) x -= parse();
                    else return x;
                }
            }
        }.parse();
    }
}