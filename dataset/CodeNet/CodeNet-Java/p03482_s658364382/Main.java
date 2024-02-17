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
            if (s.charAt(N / 2) != s.charAt(N / 2 - 1)) return 0;
            char center = s.charAt(N / 2);
            int length = 2;
            int left = N / 2 - 2, right = N / 2 + 1;
            while (left >= 0 && s.charAt(left) == center && s.charAt(right) == center) {
                left--;
                right++;
                length += 2;
            }
            return length;
        }else{
            char center = s.charAt(N/2);
            int left = N/2-1, right = N/2+1;
            int length = 1;
            while (left >= 0 && s.charAt(left) == center && s.charAt(right) == center) {
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
