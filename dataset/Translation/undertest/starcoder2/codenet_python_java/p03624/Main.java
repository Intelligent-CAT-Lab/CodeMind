import java.util.*;
public class p03624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] s2 = s.toCharArray();
        Set<Character> s3 = new HashSet<Character>();
        for (int i = 0; i < s2.length; i++) {
            s3.add(s2[i]);
        }
        char[] s4 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        if (s3.size() == 26) {
            System.out.println("None");
        } else {
            int i = 0;
            for (char c : s3) {
                if (c != s4[i]) {
                    System.out.println(s4[i]);
                    break;
                }
                if (i == s3.size()-1) {
                    System.out.println(s4[i+1]);
                }
                i++;
            }
        }
    }
}