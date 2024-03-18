Here is the translated Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int i = 0, c = 0, p = 0;
        String b = "", r = "";
        
        while (i < s.length()) {
            if (s.charAt(i) == (b.isEmpty() ? ' ' : b.charAt(0))) {
                if (c > p) {
                    r = b;
                    p = c;
                }
                c = 0;
            }
            b = Character.toString(s.charAt(i));
            i += (s.charAt(i) == 'c') ? 7 : 3;
            c++;
        }

        if (c > p) {
            r = b;
        }

        System.out.println(r.equals("e") ? "egg" : "chicken");
        scanner.close();
    }
}
```

Now let's explain how this Java code works:

1. We import `java.util.Scanner` to read the input from the user.
2. The `main` method is the entry point of the program.
3. We create a `Scanner` object to read the input string (`s`) from the user.
4. We initialize our loop and tracking variables to start at the beginning of the input string with `i=0`, `c=0`, and `p=0`.
5. `b` is an empty string that will store the last character from the input string being processed, and `r` will store the result.
6. As we iterate over the input string, we update `b` with the current character and check if it matches the last sequence's character to potentially update `r` and `p`.
7. We use a conditional operator (`?:`) to decide the step size for `i`. If the current character is `'c'`, `i` increases by 7, otherwise by 3.
8. After we finish iterating over the input string, we compare the final sequence count `c` with the previous maximum `p` to potentially update `r`.
9. We use another conditional operator to print the result based on the value of `r`. If `r` is `"e"`, we print `"egg"`, otherwise we print `"chicken"`.
10. Finally, we close the `Scanner` to avoid resource leaks.

Test the Java program with the given test input `"eggchickenegg"` to confirm it outputs `"egg"` as expected.
