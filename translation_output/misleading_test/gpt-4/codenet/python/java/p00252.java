Below is the provided Python code translated into Java:

```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class DoorStatus {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input:");
        String B = scanner.nextLine();
        
        List<String> O = Arrays.asList("1 1 0", "0 0 1");
        
        if (O.contains(B)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
        scanner.close();
    }
}
```

To test the Java code with the input you provided (`0 0 1`), you can simply run the program and enter the input when prompted. The expected output would be `Open` since the input matches one of the elements in the list `O`.
