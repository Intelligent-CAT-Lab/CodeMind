Below is the Python code translated to Java. The Java solution includes a main method to capture input from the user, count the occurrences of 'K', 'U', 'P', and 'C', and prints out the minimum of these counts.

```java
import java.util.Scanner;

public class KUPCCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        int K = countOccurrences(a, 'K');
        int U = countOccurrences(a, 'U');
        int P = countOccurrences(a, 'P');
        int C = countOccurrences(a, 'C');
        
        System.out.println(Math.min(Math.min(K, U), Math.min(P, C)));
        scanner.close();
    }
    
    private static int countOccurrences(String input, char character) {
        int count = 0;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == character)
                count++;
        }
        return count;
    }
}
```

Please note that in Java, the user input is obtained using the `Scanner` class. The character occurrences counting is done in a separate method, `countOccurrences`. Also, `System.out.println` is used to print the output.
