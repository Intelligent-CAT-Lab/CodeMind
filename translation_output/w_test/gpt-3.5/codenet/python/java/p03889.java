```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] t = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            t[i] = s.charAt(s.length() - i - 1);
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
        String ans = (s.equals(String.valueOf(t))) ? "Yes" : "No";
        System.out.println(ans);
    }
}
```
Test input:
pdbq

Expected output:
Yes
```
