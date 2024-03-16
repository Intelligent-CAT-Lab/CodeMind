import java.util.Scanner;

public class p01725 {
    static String S;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S = sc.nextLine() + "$";
        sc.close();
        
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < 27; i++) {
            int[] pri = new int[3];
            pri[0] = i % 3;
            pri[1] = (i / 3) % 3;
            pri[2] = i / 9;
            ans = Math.max(ans, parse(pri));
        }
        
        System.out.println(ans);
    }
    
    static int parse(int[] pri) {
        char[] code = {'+', '-', '*'};

        int cur = 0;
        return expr(0, code, pri, cur);
    }
    
    static int number(char[] S, int cur) {
        int num = 0;
        if (S[cur] == '(') {
            cur++; // '('
            int v = expr(S, 0, cur);
            cur++; // ')'
            return v;
        }
        while (Character.isDigit(S[cur])) {
            num = 10*num + Character.getNumericValue(S[cur]);
            cur++;
        }
        return num;
    }
    
    static int expr(char[] S, int level, int cur) {
        char[] code = {'+', '-', '*'};
        
        char op = '+';
        int result = 0;
        while (true) {
            int v;
            if (level == 2) {
                v = number(S, cur);
            } else {
                v = expr(S, level + 1, cur);
            }
            
            if (op == '+') {
                result += v;
            } else if (op == '-') {
                result -= v;
            } else {
                result *= v;
            }
            
            char c = S[cur];
            if (new String(code).contains(String.valueOf(c)) && pri[new String(code).indexOf(c)] == level) {
                break;
            }
            
            op = c;
            cur++;
        }
        return result;
    }
}