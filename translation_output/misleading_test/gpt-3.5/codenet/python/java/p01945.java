```java
import java.util.Scanner;

public class Main {
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

        int countLeftParenthesis = 0;
        int countRightParenthesis = 0;

        for (int i = 0; i < N; i++) {
            if (S[i] == '(') {
                countLeftParenthesis++;
            } else if (S[i] == ')') {
                countRightParenthesis++;
            }
        }

        int P = Math.abs(countLeftParenthesis - countRightParenthesis);
        
        countLeftParenthesis = 0;
        countRightParenthesis = 0;
        
        for (int i = N + 1; i < S.length; i++) {
            if (S[i] == '(') {
                countLeftParenthesis++;
            } else if (S[i] == ')') {
                countRightParenthesis++;
            }
        }
        
        int Q = Math.abs(countLeftParenthesis - countRightParenthesis);
        
        int result = Math.min(P, Q);
        System.out.println(result);
    }
}
```
```
