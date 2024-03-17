import java.util.*;

public class p03624 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<Character> s2 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            s2.add(s.charAt(i));
        }
        Set<Character> s3 = new HashSet<>(s2);
        List<Character> s4 = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            s4.add(c);
        }
        if (s3.size() == s4.size()) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s3.size(); i++) {
                if (!s3.contains(s4.get(i))) {
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