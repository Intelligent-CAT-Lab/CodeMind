Here is the equivalent Java code for the provided Python snippet. Please note, in Java we require to import the Scanner class for taking user input from the console.

```java
import java.util.Scanner;

public class DNAMatching {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: "); // Prompt the user
        String b = scanner.next();
        
        if (b.equals("A")) {
            System.out.println("T");
        } else if (b.equals("C")) {
            System.out.println("G");
        } else if (b.equals("G")) {
            System.out.println("C");
        } else {
            System.out.println("A");
        }
        
        scanner.close();
    }
    
}
```

To run this test case, you would compile and execute the `DNAMatching` class, then input `A` when prompted. The expected output would be `T`.
