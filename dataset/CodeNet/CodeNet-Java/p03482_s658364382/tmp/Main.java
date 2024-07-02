import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */

public class Main {
    public static int centerLength(String s){
        int N = s.length();
System.out.println("[INST]10;N;s.length();"+N);
        if(N%2==0){
            if (s.charAt(N / 2) != s.charAt(N / 2 - 1)) return 0;
System.out.println("[INST]12;None;s.charAt(N / 2);"+s.charAt(N / 2));
System.out.println("[INST]12;None;s.charAt(N / 2 - 1);"+s.charAt(N / 2 - 1));
            char center = s.charAt(N / 2);
System.out.println("[INST]13;center;s.charAt(N / 2);"+center);
            int length = 2;
            int left = N / 2 - 2, right = N / 2 + 1;
            while (left >= 0 && s.charAt(left) == center && s.charAt(right) == center) {
System.out.println("[INST]16;None;s.charAt(left);"+s.charAt(left));
System.out.println("[INST]16;None;s.charAt(right);"+s.charAt(right));
                left--;
                right++;
                length += 2;
            }
            return length;
        }else{
            char center = s.charAt(N/2);
System.out.println("[INST]23;center;s.charAt(N/2);"+center);
            int left = N/2-1, right = N/2+1;
            int length = 1;
            while (left >= 0 && s.charAt(left) == center && s.charAt(right) == center) {
System.out.println("[INST]26;None;s.charAt(left);"+s.charAt(left));
System.out.println("[INST]26;None;s.charAt(right);"+s.charAt(right));
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
System.out.println("[INST]36;S;sc.next();"+S);
        int N = S.length();
System.out.println("[INST]37;N;S.length();"+N);
        System.out.println(N - (N-centerLength(S))/2);

    }
}
