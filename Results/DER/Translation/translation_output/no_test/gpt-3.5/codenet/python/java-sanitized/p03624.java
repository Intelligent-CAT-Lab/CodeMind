import java.util.*;

public class p03624 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Character> s = new ArrayList<>();
        for (char c : input.toCharArray()) {
            s.add(c);
        }

        List<Character> s2 = new ArrayList<>(s);
        List<Character> s3 = new ArrayList<>(new HashSet<>(s2));
        Collections.sort(s3);

        List<Character> s4 = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        
        if (s3.equals(s4)) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s3.size(); i++) {
                if (s3.get(i) != s4.get(i)) {
                    System.out.println(s4.get(i));
                    break;
                }
                if (i == s3.size() - 1) {
                    System.out.println(s4.get(i+1));
                }
            }
        }
    }
}