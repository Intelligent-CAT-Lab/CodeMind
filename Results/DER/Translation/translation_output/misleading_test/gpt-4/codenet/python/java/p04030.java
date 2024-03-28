Here's the equivalent Java code for the Python snippet provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuilder a = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'B') {
                if (a.length() > 0) {
                    a.deleteCharAt(a.length() - 1);
                }
            } else {
                a.append(c);
            }
        }
        
        System.out.println(a.toString());
    }
}
```

This Java program reads a string from the input, performs the backspace-like operation ('B' character indicates a backspace), and prints the resulting string, just like the original Python code. To compile and run the program, you should input the test case "01B0", and you would expect the output to be the string "-11".
