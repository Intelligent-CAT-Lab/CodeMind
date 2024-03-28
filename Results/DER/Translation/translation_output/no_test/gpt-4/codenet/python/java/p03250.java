Below is the equivalent Java code for the given Python snippet:

```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input and convert to list of integers
        String[] inputs = scanner.nextLine().split(" ");
        List<Integer> abc = new ArrayList<>();
        for (String input : inputs) {
            abc.add(Integer.parseInt(input));
        }
        
        // Sort the list
        Collections.sort(abc);
        
        // Build the number and add to the smallest number
        int result = Integer.parseInt(abc.get(2).toString() + abc.get(1).toString()) + abc.get(0);
        
        // Print the result
        System.out.println(result);
        
        scanner.close();
    }
}
```

Note that Java is statically typed and generally more verbose than Python, so we must perform a few more steps, such as importing the necessary classes (ArrayList, Collections, List, and Scanner), explicitly splitting input lines, converting Strings to Integers, and closing the Scanner to avoid resource leaks.
