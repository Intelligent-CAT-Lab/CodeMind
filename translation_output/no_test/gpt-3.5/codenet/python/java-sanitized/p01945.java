import java.util.*;

public class p01945 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] S = input.toCharArray();
        
        int N = 0;
        for (int i = 0; i < S.length; i++) {
            if (S[i] == '*') {
                N = i;
                break;
            }
        }
        
        int P = Math.abs(countParentheses(S, 0, N, '(') - countParentheses(S, 0, N, ')'));
        int Q = Math.abs(countParentheses(S, N + 1, S.length, '(') - countParentheses(S, N + 1, S.length, ')'));
        
        System.out.println(Math.min(P, Q));
    }
    
    public static int countParentheses(char[] S, int start, int end, char paren) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (S[i] == paren) {
                count++;
            }
        }
        return count;
    }
}