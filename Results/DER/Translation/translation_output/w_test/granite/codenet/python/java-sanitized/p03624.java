import java.util.*;

public class p03624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] s2 = s.toCharArray();
        Arrays.sort(s2);
        char[] s3 = new char[26];
        int count = 0;
        for (int i = 0; i < s2.length; i++) {
            if (s3[s2[i] - 'a'] == 0) {
                s3[s2[i] - 'a'] = s2[i];
                count++;
            }
        }
        if (count == 26) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s3.length; i++) {
                if (s3[i] == 0) {
                    System.out.println((char) (i + 'a'));
                    break;
                }
            }
        }
    }
}