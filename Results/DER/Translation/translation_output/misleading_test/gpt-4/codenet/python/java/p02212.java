Here's the translated Java code for the given Python script:

```java
import java.util.Arrays;
import java.util.Scanner;

public class SumDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        
        for (int i = 0; i < 4; i++) {
            numbers[i] = scanner.nextInt();
        }
        
        Arrays.sort(numbers);
        
        int result = Math.abs((numbers[0] + numbers[3]) - (numbers[1] + numbers[2]));
        System.out.println(result);
        
        scanner.close();
    }
}
```

This code reads four integers from the standard input, sorts them, calculates the absolute difference between the sum of the first and last elements and the sum of the second and third elements, and then prints this difference.
