Below is the translation of the given Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int l = a.length();
        int i = 0, ans = 0;
        
        while (i < l) {
            int lenj = 0, leno = 0, leni = 0;
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
        sc.close();
    }
}
```
Please note that in Java, we use `Scanner` to read input from the console, strings are indexed with `charAt(int index)`, and we print to the console using `System.out.println(Object)`. Also, don't forget to close the scanner at the end of the program to avoid resource leaks.
