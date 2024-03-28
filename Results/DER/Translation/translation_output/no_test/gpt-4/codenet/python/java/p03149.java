Here's the equivalent Java code for the provided Python script:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading a single line of input and splitting it by space
        String[] inputStrings = scanner.nextLine().split(" ");
        
        // Parsing integers from input strings and sorting them
        List<Integer> a = new ArrayList<>();
        for (String item : inputStrings) {
            a.add(Integer.parseInt(item));
        }
        Collections.sort(a);
        
        // Defining list b
        List<Integer> b = Arrays.asList(1, 4, 7, 9);
        
        // Comparing lists a and b
        String ans = a.equals(b) ? "YES" : "NO";
        
        // Printing the result
        System.out.println(ans);
        scanner.close();
    }
}
```

What this Java code does is:

1. Import the necessary Java utility classes.
2. Read a line of input from the user.
3. Split the line by spaces, converting it into an array of strings.
4. Parse each string in the input array into an integer, add it to a list `a`, and then sort the list.
5. Define a pre-set list `b`.
6. Compare the two lists to see if they are equal.
7. Output "YES" if they are equal, and "NO" if they are not.
