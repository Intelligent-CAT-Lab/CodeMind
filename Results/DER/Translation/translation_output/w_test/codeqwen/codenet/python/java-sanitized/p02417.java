import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class p02417 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> D = new HashMap<>();
        while (scanner.hasNextLine()) {
            String S = scanner.nextLine();
            for (char s : S.toCharArray()) {
                if (Character.isLetter(s)) {
                    char lowerCase = Character.toLowerCase(s);
                    D.put(lowerCase, D.getOrDefault(lowerCase, 0) + 1);
                }
            }
        }

        for (char s = 'a'; s <= 'z'; s++) {
            System.out.print(s + " : ");
            if (D.containsKey(s)) {
                System.out.println(D.get(s));
            } else {
                System.out.println(0);
            }
        }
    }
}