import java.util.*;

public class p02910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String odd[] = {"R", "U", "D"};
        String even[] = {"L", "U", "D"};

        for (int i = 0; i < s.length(); i += 2) {
            boolean found = false;
            for (String o : odd) {
                if (s.charAt(i) == o) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No");
                return;
            }
        }

        for (int i = 1; i < s.length(); i += 2) {
            boolean found = false;
            for (String e : even) {
                if (s.charAt(i) == e) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}