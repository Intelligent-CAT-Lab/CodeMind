Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);

        if (Arrays.equals(Arrays.sort(new int[]{a, b, c}), new int[]{5, 5, 7})) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

Please note that in Java, we use `Arrays.sort()` method to sort an array. Also, `Arrays.equals()` method is used to compare two arrays. The `Arrays.sort()` method sorts the array in ascending order and `Arrays.equals()` method checks if two arrays are equal.
