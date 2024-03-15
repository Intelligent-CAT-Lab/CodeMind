Here's the equivalent Java code for your Python snippet:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();

        if (S.equals("AAA") || S.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        
        scanner.close();
    }
}
```
Remember that Java is a statically typed language, in contrast with Python which is dynamically typed. Thus, in Java, you need to declare the type of each variable before you use it, as shown with `String S`. Additionally, Java uses the `equals` method to compare the contents of two strings, rather than the `==` operator which checks for reference equality in Java.
