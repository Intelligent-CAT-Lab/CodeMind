Certainly! Here's the equivalent Java code for the provided Python script:

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] S = input.toCharArray();
        HashMap<Character, Integer> C = new HashMap<>();
        
        for (char ch : S) {
            C.put(ch, C.getOrDefault(ch, 0) + 1);
        }
        
        int[] o = new int[C.size()];
        int index = 0;  // To keep track of where to insert in o
        
        for (char a : C.keySet()) {
            int j = 0;
            int m = 0;
            for (char b : S) {
                if (a == b) {
                    j = 0;
                } else {
                    j += 1;
                    m = Math.max(m, j);
                }
            }
            o[index++] = m; // Update the o array with the maximum value
        }
        
        int minInO = o[0];
        for (int i = 1; i < o.length; i++) {
            if (o[i] < minInO) {
                minInO = o[i]; 
            }
        }
        
        System.out.println(minInO);
        scanner.close();
    }
}
```

Here is how the code works:

- A `Scanner` object is used to read the input from the standard input.
- The input string is converted to a character array `S`.
- A `HashMap` named `C` is used to count the occurrences of each character (like the `Counter` in Python).
- An array `o` is declared to store the maximum distance `m` for each character in the key set of `C`.
- Two nested for-loops are used to calculate `m` for each character `a`, similar to the Python code.
- The minimum value from the array `o` is determined.
- Finally, the minimum value is printed to the standard output.

Please note that it's important to close the scanner at the end of the method to avoid potential resource leaks.
