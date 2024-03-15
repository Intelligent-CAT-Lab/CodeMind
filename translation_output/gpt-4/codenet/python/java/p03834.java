Certainly! Below is the Python code translated into Java. It includes reading a line from standard input, and then replacing all commas with spaces:

```java
import java.util.Scanner;

public class ReplaceCommas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        String replacedString = s.replace(",", " ");
        System.out.println(replacedString);
    }
}
```
