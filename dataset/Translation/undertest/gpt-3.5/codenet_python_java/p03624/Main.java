import java.util.*;

public class p03624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] s = input.toCharArray();
        List<Character> s2 = new ArrayList<Character>();
        for (int i = 0; i < s.length; i++) {
            s2.add(s[i]);
        }
        Set<Character> s3 = new HashSet<Character>(s2);
        List<Character> s3List = new ArrayList<Character>(s3);
        Collections.sort(s3List);
        char[] s4 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        
        if (s3List.size() == s4.length) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s3List.size(); i++) {
                if (s3List.get(i) != s4[i]) {
                    System.out.println(s4[i]);
                    break;
                }
                if (i == s3List.size() - 1) {
                    System.out.println(s4[i + 1]);
                }
            }
        }
    }
}