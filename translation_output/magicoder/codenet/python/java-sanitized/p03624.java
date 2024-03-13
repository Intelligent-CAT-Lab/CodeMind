import java.util.*;

public class p03624 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] s = input.toCharArray();
        List<Character> s2 = new ArrayList<>();
        for (char c : s) {
            s2.add(c);
        }
        Set<Character> s3 = new TreeSet<>(s2);
        List<Character> s4 = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
        if (s3.equals(new ArrayList<>(s4))) {
            System.out.println("None");
        } else {
            int i = 0;
            for (char c : s3) {
                if (c != s4.get(i)) {
                    System.out.println(s4.get(i));
                    break;
                }
                i++;
                if (i == s3.size()) {
                    System.out.println(s4.get(i));
                }
            }
        }
    }
}