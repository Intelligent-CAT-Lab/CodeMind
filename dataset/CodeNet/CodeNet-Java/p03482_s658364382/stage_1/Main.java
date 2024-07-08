import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class Main {
    public static int centerLength(String s){
        int N = s.length();
        if(N%2==0){
var newVariable_0 = s.charAt(N / 2);var newVariable_1 = s.charAt(N / 2 - 1);            if (s.charAt(N / 2) != newVariable_1) return 0;
            char center = s.charAt(N / 2);
            int length = 2;
            int left = N / 2 - 2, right = N / 2 + 1;
var newVariable_2 = s.charAt(left);var newVariable_3 = s.charAt(right);            while (left >= 0 && s.charAt(left) == center && newVariable_3 == center) {
                left--;
                right++;
                length += 2;
            }
            return length;
        }else{
            char center = s.charAt(N/2);
            int left = N/2-1, right = N/2+1;
            int length = 1;
var newVariable_4 = s.charAt(left);var newVariable_5 = s.charAt(right);            while (left >= 0 && s.charAt(left) == center && newVariable_5 == center) {
                left--;
                right++;
                length += 2;
            }
            return length;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        System.out.println(N - (N-centerLength(S))/2);

    }
}
