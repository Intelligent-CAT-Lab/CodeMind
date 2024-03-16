Below is the translation of your provided Python code into Java code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int Now = 0;
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            int Next = alpha.indexOf(s);
            // System.out.println(s + " " + Now + " " + Next);

            if (Now < Next) {
                // do nothing
            } else {
                ans++;
            }
            Now = Next;
        }
        System.out.println(ans);
    }
}
```

Please notice that Java is a statically typed language and has a different syntax compared to Python. A few key differences to note:
- In Java, you need to define the class and method from which the program begins its execution (`public static void main(String[] args)`).
- You should declare the type of each variable.
- `indexOf` method is used in Java (instead of `find` in Python) to get the index of a character in a string.
- `Scanner` class is used to get input from the user in Java.
- Java code generally requires proper encapsulation with `{}` brackets after for loops, if conditions, and method definitions.
