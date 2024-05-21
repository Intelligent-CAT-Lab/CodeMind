import java.util.*;

public class p02910 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> odd = Arrays.asList("R", "U", "D");
        List<String> even = Arrays.asList("L", "U", "D");

        for (int i = 0; i < s.length(); i += 2) {
            if (!odd.contains(String.valueOf(s.charAt(i)))) {
                System.out.println("No");
                System.exit(0);
            }
        }

        for (int j = 1; j < s.length(); j += 2) {
            if (!even.contains(String.valueOf(s.charAt(j)))) {
                System.out.println("No");
                System.exit(0);
            }
        }

        System.out.println("Yes");
    }
}