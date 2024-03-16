```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int l = a.length();
        int i = 0;
        int ans = 0;

        while (i < l) {
            int lenj = 0;
            int leno = 0;
            int leni = 0;

            while (i < l && a.charAt(i) == 'J') {
                lenj++;
                i++;
            }
            while (i < l && a.charAt(i) == 'O') {
                leno++;
                i++;
            }
            while (i < l && a.charAt(i) == 'I') {
                leni++;
                i++;
            }
            if (lenj >= leno && leni >= leno) {
                ans = Math.max(ans, leno);
            }
        }
        System.out.println(ans);

        scanner.close();
    }
}
```

The above Java code translates the given Python program into Java. It reads a string from the standard input, iterates over the characters to count consecutive 'J', 'O', and 'I' characters, and finds the maximum length of 'O' that is surrounded by equal or greater numbers of 'J' and 'I'. It then prints the answer to the standard output.
