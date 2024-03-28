```java
import java.util.Scanner;

public class Main {
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

        String ans = new String(s).equals(new String(t)) ? "Yes" : "No";
        System.out.println(ans);
    }
}
```
