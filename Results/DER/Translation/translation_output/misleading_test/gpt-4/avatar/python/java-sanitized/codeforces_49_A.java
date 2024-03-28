import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class codeforces_49_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int start = sentence.length() - 1;
        char letter = '\0';
        
        while (true) {
            if (sentence.charAt(start) != '▁' && sentence.charAt(start) != '?') {
                letter = sentence.charAt(start);
                break;
            }
            start--;
        }
        
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');
        
        if (vowels.contains(Character.toLowerCase(letter))) {
            System.out.println("YES");
        } else {
            System.out.println("NO" + Character.toUpperCase(letter));
        }

        scanner.close();
    }
}