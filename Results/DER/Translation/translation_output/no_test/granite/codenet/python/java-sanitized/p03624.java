import java.util.*;

public class p03624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] s2 = s.toCharArray();
        Arrays.sort(s2);
        char[] s3 = new char[s2.length];
        int j = 0;
        for (int i = 0; i < s2.length; i++) {
            if (i == 0 || s2[i]!= s2[i - 1]) {
                s3[j++] = s2[i];
            }
        }
        char[] s4 = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        if (Arrays.equals(s3, s4)) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s3.length; i++) {
                if (s3[i]!= s4[i]) {
                    System.out.println(s4[i]);
                    break;
                }
                if (i == s3.length - 1) {
                    System.out.println(s4[i + 1]);
                }
            }
        }
    }
}