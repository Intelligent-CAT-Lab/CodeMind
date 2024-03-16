```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Christmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        Map<Integer, String> d = new HashMap<>();
        d.put(25, "Christmas");
        d.put(24, "Christmas Eve");
        d.put(23, "Christmas Eve Eve");
        d.put(22, "Christmas Eve Eve Eve");
        
        System.out.println(d.get(D));
        scanner.close();
    }
}
```

When you run this Java program, it will read an integer from standard input, just like the Python code does. Then, it will print out the corresponding String based on the value of the input integer, akin to how the dictionary in the Python code does.
