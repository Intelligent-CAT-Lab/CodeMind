import java.util.*;
public class p04032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length() == 2) {
            if(s.charAt(0) == s.charAt(1)) {
                System.out.println("1 2");
            } else {
                System.out.println("-1 -1");
            }
            return;
        }
        for(int i = 0; i < s.length()-2; i++) {
            Set<Character> set = new HashSet<>();
            for(int j = i; j < i+3; j++) {
                set.add(s.charAt(j));
            }
            if(set.size() <= 2) {
                System.out.println(i+1 + " " + (i+3));
                return;
            }
        }
        System.out.println("-1 -1");
    }
}