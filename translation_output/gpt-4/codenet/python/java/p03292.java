Here's the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        
        int[] A = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            A[i] = Integer.parseInt(input[i]);
        }
        
        int b = Math.abs(A[0] - A[1]) + Math.abs(A[0] - A[2]);
        int c = Math.abs(A[0] - A[1]) + Math.abs(A[1] - A[2]);
        int d = Math.abs(A[0] - A[2]) + Math.abs(A[1] - A[2]);
        
        int minDistance = Math.min(b, Math.min(c, d));
        
        System.out.println(minDistance);
        
        scanner.close();
    }
}
```

In this Java code, we're using `Scanner` to read input from the user and splitting the input string into an array of strings. Then we parse the individual strings into integers to populate the array `A`. We calculate the distances `b`, `c`, and `d` using `Math.abs` for absolute value calculation. Finally, we print the minimum of these three values.
