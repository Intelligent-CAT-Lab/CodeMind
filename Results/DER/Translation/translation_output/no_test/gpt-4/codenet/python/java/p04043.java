Below is the Java translation for the provided Python code. The Java code includes input reading from the console, and checks if the input contains two numbers with the value 5 and one number with the value 7 after sorting:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading three integers from the input
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        // Creating an array from the input integers
        int[] numbers = {a, b, c};
        
        // Sorting the array
        Arrays.sort(numbers);
        
        // Checking if the sorted array matches the required pattern
        if(numbers[0] == 5 && numbers[1] == 5 && numbers[2] == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
```

Make sure you include necessary imports at the top of your Java file, and wrap the code in an appropriate class structure with a `main` method to make it executable.
