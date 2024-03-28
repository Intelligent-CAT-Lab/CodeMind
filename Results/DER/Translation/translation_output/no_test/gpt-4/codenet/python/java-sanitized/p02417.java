import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class p02417 {
    public static void main(String[] args) {
        ArrayList<Character> A = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String S;
        try {
            while ((S = reader.readLine()) != null) {
                for (char s : S.toCharArray()) {
                    if (('a' <= s && s <= 'z') || ('A' <= s && s <= 'Z')) {
                        A.add(Character.toLowerCase(s));
                    }
                }
            }
        } catch (IOException e) {
            // Assuming catching IOException is equivalent to handling EOFError in Python
        }

        HashMap<Character, Integer> D = new HashMap<>();
        for (char s : A) {
            if (D.containsKey(s)) {
                D.put(s, D.get(s) + 1);
            } else {
                D.put(s, 1);
            }
        }

        for (int i = 97; i < 97 + 26; i++) {
            char s = (char) i;
            System.out.print(s + " : ");
            if (D.containsKey(s)) {
                System.out.println(D.get(s));
            } else {
                System.out.println(0);
            }
        }
    }
}