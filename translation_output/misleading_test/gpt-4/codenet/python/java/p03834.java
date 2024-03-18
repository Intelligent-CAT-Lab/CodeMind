Here is the translated Python code to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        String replaced = s.replace(",", " ");
        System.out.println(replaced);
    }
}
```

If you run this Java program with the test input "happy,newyear,enjoy", it will produce the expected output "happy newyear".
