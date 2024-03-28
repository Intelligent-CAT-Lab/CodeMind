Below is the translated Java code based on the given Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int i = 0;
        int j = S.length() - 1;
        int c = 0;
        
        while(true) {
            if (i >= j) {
                break;
            }
            if (S.charAt(i) == S.charAt(j)) {
                i++;
                j--;
            } else {
                if (S.charAt(i) == 'x') {
                    i++;
                    c++;
                } else if (S.charAt(j) == 'x') {
                    j--;
                    c++;
                } else {
                    System.out.println("-1");
                    System.exit(0);
                }
            }
        }
        System.out.println(c);
        scanner.close();
    }
}
```

In Java, we need to use the `charAt` method to access characters at specific indices of the string since strings are not directly indexable as they are in Python. Additionally, Java's `System.exit` method is used to exit the program, similar to Python's `sys.exit`. Lastly, we wrap the entire code inside a `Main` class with the `main` method, which is the entry point of the application. A `Scanner` object is used to handle user input.
