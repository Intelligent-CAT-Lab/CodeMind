import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class p03624 {
    public static void main(String[] args) {
        String s = "atcoderregularcontest";
        char[] s2 = s.toCharArray();
        Set<Character> s3 = new HashSet<>();
        for (char c : s2) {
            s3.add(c);
        }
        char[] s4 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] s5 = new char[s4.length];
        int j = 0;
        for (char c : s3) {
            s5[j++] = c;
        }
        Arrays.sort(s5);
        if (Arrays.equals(s5, s4)) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s5.length; i++) {
                if (s5[i] != s4[i]) {
                    System.out.println(s4[i]);
                    break;
                }
                if (i == s5.length - 1) {
                    System.out.println(s4[i + 1]);
                }
            }
        }
    }
}