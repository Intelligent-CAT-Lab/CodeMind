import java.util.*;
public class p03624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<Character> s2 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            s2.add(s.charAt(i));
        }
        List<Character> s3 = new ArrayList<>(new HashSet<>(s2));
        Collections.sort(s3);
        List<Character> s4 = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            s4.add((char) (i + 97));
        }
        if (s3.equals(s4)) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s3.size(); i++) {
                if (s3.get(i)!= s4.get(i)) {
                    System.out.println(s4.get(i));
                    break;
                }
                if (i == s3.size() - 1) {
                    System.out.println(s4.get(i + 1));
                }
            }
        }
    }
}