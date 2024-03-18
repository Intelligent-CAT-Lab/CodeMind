import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class p02910 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<Character> odd = Arrays.asList('R', 'U', 'D');
        List<Character> even = Arrays.asList('L', 'U', 'D');

        for (int i = 0; i < s.length(); i += 2) {
            if (!odd.contains(s.charAt(i))) {
                System.out.println("No");
                return;
            }
        }
        
        for (int j = 1; j < s.length(); j += 2) {
            if (!even.contains(s.charAt(j))) {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}