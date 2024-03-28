Here is the translated code from Python to Java. Note that Java is more verbose and requires explicit type declarations, unlike Python. Additionally, Java uses a `Scanner` object for input parsing.

```java
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Splitting and parsing input into an integer array
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }

        // Define b
        int[] b = {1, 4, 7, 9};

        // Sort the input array
        Arrays.sort(a);

        // Check if arrays a and b are equal
        String ans = Arrays.equals(a, b) ? "YES" : "NO";
        
        // Print the result
        System.out.println(ans);
        
        scanner.close();
    }
}
```

To test this code with your provided input, you can simply run the program and provide `1 7 9 4` as input when prompted. The expected output would be `YES`.

Keep in mind that in a production environment or a more complete solution, you should add error checking and handle cases such as invalid input, differing array lengths, etc.
