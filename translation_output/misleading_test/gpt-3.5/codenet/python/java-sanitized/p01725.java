import java.util.Scanner;
import java.util.Arrays;

public class p01725 {
    
    static String S;
    static int cur;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        S = input.nextLine() + "$";
        
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<27; i++){
            int[] pri = new int[3];
            pri[0] = i % 3;
            pri[1] = (i / 3) % 3;
            pri[2] = i / 9;
            ans = Math.max(ans, parse(pri));
        }
        
        System.out.println(ans);
    }
    
    public static int parse(int[] pri) {
        char[] code = {'+', '-', '*'};
        
        cur = 0;
        return expr(pri, 0, code);
    }
    
    public static int expr(int[] pri, int level, char[] code) {
        char op = '+';
        int result = 0;
        
        while (true) {
            int v;
            if (level == 2) {
                v = number();
            } else {
                v = expr(pri, level + 1, code);
            }
            if (op == '+') {
                result += v;
            } else if (op == '-') {
                result -= v;
            } else {
                result *= v;
            }
            char c = S.charAt(cur);
            if (new String(code).indexOf(c) == -1 || pri[new String(code).indexOf(c)] != level) {
                break;
            }
            op = c;
            cur++;
        }
        
        return result;
    }
    
    public static int number() {
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char c = S.charAt(cur);
        
        if (c == '(') {
            cur++; // '('
            int v = expr(new int[]{0, 1, 2}, 0, new char[]{'+', '-', '*'});
            cur++; // ')'
            return v;
        }
        
        int num = 0;
        while (new String(digits).indexOf(S.charAt(cur)) != -1) {
            num = 10*num + Character.getNumericValue(S.charAt(cur));
            cur++;
        }
        
        return num;
    }
}