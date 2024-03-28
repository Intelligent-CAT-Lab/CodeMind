import java.util.*;
public class p02417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] A = S.split(" ");
        Map<String, Integer> D = new HashMap<String, Integer>();
        for (String s : A) {
            if (s.length() == 1) {
                if (s.toLowerCase().compareTo("a") >= 0 && s.toLowerCase().compareTo("z") <= 0) {
                    if (D.containsKey(s.toLowerCase())) {
                        D.put(s.toLowerCase(), D.get(s.toLowerCase()) + 1);
                    } else {
                        D.put(s.toLowerCase(), 1);
                    }
                }
            }
        }
        String[] Str = new String[26];
        for (int i = 0; i < 26; i++) {
            Str[i] = String.valueOf((char) (i + 97));
        }
        for (String s : Str) {
            System.out.print(s + " : ");
            if (D.containsKey(s)) {
                System.out.println(D.get(s));
            } else {
                System.out.println(0);
            }
        }
    }
}