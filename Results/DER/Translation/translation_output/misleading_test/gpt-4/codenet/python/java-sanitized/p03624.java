import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class p03624 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();
        
        Set<Character> characterSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            characterSet.add(c);
        }
        
        List<Character> s3 = new ArrayList<>(characterSet);
        Collections.sort(s3);
        
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        if (s3.size() == alphabet.length()) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s3.size(); i++) {
                if (s3.get(i) != alphabet.charAt(i)) {
                    System.out.println(alphabet.charAt(i));
                    break;
                }
                if (i == s3.size() - 1) {
                    System.out.println(alphabet.charAt(i + 1));
                }
            }
        }
    }
}