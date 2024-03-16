Below is the translated Java code, which takes input from the console and prints "Yes" or "No" based on the input string:

```java
import java.util.Scanner;

public class GreetingChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();
        
        if ("hi".equals(S) || "hihi".equals(S) || "hihihi".equals(S) || "hihihihi".equals(S) || "hihihihihi".equals(S)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

To use this code, you would need to compile it and then run the compiled class file. When running, the program will wait for input from the console. After entering a string and pressing enter, it will display "Yes" or "No".
