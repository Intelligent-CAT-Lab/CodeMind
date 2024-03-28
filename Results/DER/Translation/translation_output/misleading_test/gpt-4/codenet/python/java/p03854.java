Below is the translated version of the provided Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        if (S.length() < 5) {
            System.out.println("NO");
            return;
        } else {
            int i = 0;
            while (true) {
                if ((i + 5 == S.length() && S.substring(i, i + 5).equals("dream")) ||
                    (i + 5 == S.length() && S.substring(i, i + 5).equals("erase")) ||
                    (i + 6 == S.length() && S.substring(i, i + 6).equals("eraser")) ||
                    (i + 7 == S.length() && S.substring(i, i + 7).equals("dreamer"))) {
                    System.out.println("YES");
                    return;
                } else if (i + 5 <= S.length() && S.substring(i, i + 5).equals("dream") && i + 8 <= S.length()) {
                    if (S.substring(i + 5, i + 8).equals("erd") || S.substring(i + 5, i + 8).equals("ere"))
                        i += 7;
                    else if (S.substring(i + 5, i + 8).equals("era") || S.substring(i + 5, i + 6).equals("d"))
                        i += 5;
                    else {
                        System.out.println("NO");
                        return;
                    }
                } else if (i + 5 <= S.length() && S.substring(i, i + 5).equals("erase") && i + 7 <= S.length()) {
                    if (S.substring(i + 5, i + 6).equals("e") || S.substring(i + 5, i + 6).equals("d"))
                        i += 5;
                    else if (S.substring(i + 5, i + 6).equals("r"))
                        i += 6;
                    else {
                        System.out.println("NO");
                        return;
                    }
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }
    }
}
```

This Java program replicates the logic of the provided Python code: it reads a string and then verifies whether the string is made up by a series of the words "dream", "dreamer", "erase", and "eraser" in such a way that matches the given constraints. If such a combination is possible, it prints "YES", otherwise it prints "NO". To test this code, you need to run it within a Java environment, as it relies on standard input to get the value of S.
