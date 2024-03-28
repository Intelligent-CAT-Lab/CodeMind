Here is the equivalent Java code for the provided Python snippet:

```java
import java.util.*;

public class FindZeroIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading a line of input and splitting it into an array of strings
        String[] inputs = scanner.nextLine().split("\\s+");

        // Converting the input strings to integers and storing them in an array
        int[] x_list = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            x_list[i] = Integer.parseInt(inputs[i]);
        }

        // Looping through the first 5 elements of the array to find a zero
        for (int i = 0; i < 5; i++) {
            if (x_list[i] == 0) {
                System.out.println(i + 1);
            }
        }

        scanner.close();
    }
}
```

Please note that the above Java code assumes that the input will consist of at least 5 elements, similar to the assumption in the Python code. If fewer than 5 elements are inputted, an `ArrayIndexOutOfBoundsException` would occur. To prevent this, additional error checking could be included to ensure that there are enough elements in the array before attempting to access index `i`.
