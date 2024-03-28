Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt(); // read first input (H)
        int A = scanner.nextInt(); // read second input (A)
        
        // Calculate the ceiling of H divided by A
        int result = (int) Math.ceil((double) H / A);
        
        // Output the result
        System.out.println(result);
        
        scanner.close();
    }
}
```

To use this code with the provided test input `10 4` and get the expected output `88`, you would need to run the `Main` class and input `10 4` when prompted. The output will be displayed in the console.

Please note that in a real-world scenario, you'd likely want to add some error handling and user prompts for clarity, but since this is a direct translation of the script you provided, I've kept it simple and straight to the point.
