import java.util.*;
public class p03624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] s2 = s.toCharArray();
        Arrays.sort(s2);
        String s3 = new String(s2);
        String s4 = "abcdefghijklmnopqrstuvwxyz";
        if (s3.equals(s4)) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s3.length(); i++) {
                if (s3.charAt(i) != s4.charAt(i)) {
                    System.out.println(s4.charAt(i));
                    break;
                }
                if (i == s3.length()-1) {
                    System.out.println(s4.charAt(i+1));
                }
            }
        }
    }
}