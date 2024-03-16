To translate the Python code into Java, there are a few important points to consider: 

1. Java is statically typed, so we need to specify the type of each variable.
2. In Java, arrays have a fixed size and must be declared as such. We'll use a `Scanner` object for input and an `ArrayList<Integer>` to hold the variable-length list of integers.
3. Java doesn't have a built-in `floor` function in its `Math` class since it automatically floors the number when doing integer division.
4. Instead of the Python `print` function, we use `System.out.print` or `System.out.println`.
5. There's no direct equivalent of Python's f-string in Java, so we'll concatenate strings using the `+` operator.

Here's the equivalent Java code:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Read integers and add them to the list
        for (int i = 0; i < 6; i++) {
            arr.add(scanner.nextInt());
        }
        
        int rem = 0;
        int ones = 0;
        ArrayList<Integer> string = new ArrayList<>();
        
        ones = arr.get(5) % arr.get(1);
        for (int i = 0; i < arr.get(1); i++) {
            string.add(arr.get(5) / arr.get(1) + (ones > 0 ? 1 : 0));
            ones--;
        }
        
        if (!arr.get(0).equals(arr.get(1))) {
            rem = arr.get(4) - arr.get(5);
            ones = rem % (arr.get(0) - arr.get(1));
            for (int i = arr.get(1); i < arr.get(0); i++) {
                string.add(rem / (arr.get(0) - arr.get(1)) + (ones > 0 ? 1 : 0));
                ones--;
            }
        }
        
        for (int num : string) {
            System.out.print(num + " â ");
        }
        
        scanner.close();
    }
}
```

Please note that the special character â used in the original Python code might not display correctly in all environments, systems, or fonts. If you are facing issues with it in Java or if the requirement is to use a specific character, you would need to replace it with the correct Unicode or ASCII character as needed.
