```java
import java.util.Scanner;

public class CharacterConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] s = input.toCharArray();
        char[] t = new char[s.length];

        for (int i = 0; i < s.length; i++) {
            t[i] = s[s.length - 1 - i];
            if (t[i] == 'p') {
                t[i] = 'q';
            } else if (t[i] == 'q') {
                t[i] = 'p';
            }
            if (t[i] == 'b') {
                t[i] = 'd';
            } else if (t[i] == 'd') {
                t[i] = 'b';
            }
        }

        String ans;
        if (String.valueOf(s).equals(String.valueOf(t))) {
            ans = "Yes";
        } else {
            ans = "No";
        }
        System.out.println(ans);
    }
}
```
