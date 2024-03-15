```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] input_methods = { "clipboard", "file", "key" };
        int using_method = 0;
        String input_method = input_methods[using_method];
        int mod = 1000000007;

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int pp = 0;
        int na = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(s.length() - 1 - i);
            int cc = na + Character.getNumericValue(c);
            na = 0;
            if (cc <= 4) {
                pp += cc;
            } else {
                na = 1;
                if (i == s.length() - 1) {
                    pp += 1;
                }
                pp += 10 - cc;
            }
        }
        System.out.println(pp);
    }
}
```
