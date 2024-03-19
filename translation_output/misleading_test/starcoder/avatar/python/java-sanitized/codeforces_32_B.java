import java.util.*;
public class codeforces_32_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String result = " ";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == ". ".charAt(0)) {
                result += '0';
            } else {
                i += 1;
                if (s.charAt(i) == ". ".charAt(0)) {
                    result += '1';
                } else {
                    result += '2';
                }
            }
            i += 1;
        }
        System.out.println(result);
    }
}