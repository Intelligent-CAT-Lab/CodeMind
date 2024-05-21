import java.util.*;

public class p04019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        if (set.size() == 4) {
            System.out.println("Yes");
        } else if (set.size() == 3) {
            System.out.println("No");
        } else if (set.size() == 2) {
            if (set.contains('N') && set.contains('S')) {
                System.out.println("Yes");
            } else if (set.contains('E') && set.contains('W')) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}