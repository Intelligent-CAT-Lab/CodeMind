Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] s = input.toCharArray();
        char[] t = new char[s.length];
        
        // Reverse the input string and replace characters accordingly
        for (int i = 0; i < s.length; i++) {
            char ch = s[s.length - i - 1];
            switch (ch) {
                case 'p':
                    t[i] = 'q';
                    break;
                case 'q':
                    t[i] = 'p';
                    break;
                case 'b':
                    t[i] = 'd';
                    break;
                case 'd':
                    t[i] = 'b';
                    break;
                default:
                    t[i] = ch;
            }
        }
        
        // Check if arrays s and t are equal
        String ans = "Yes";
        for (int i = 0; i < s.length; i++) {
            if (s[i] != t[i]) {
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
        
        sc.close();
    }
}
```

In this Java program, we use Scanner for input, an array of characters to store the original and transformed strings. We then check for equality between the original and transformed strings and output "Yes" if they are the same and "No" otherwise.

Make sure to compile and run this Java program when the input is provided in order to get the correct output.
