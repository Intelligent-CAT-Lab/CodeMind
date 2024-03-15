Here is the translated code from Python to Java:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] l = new int[input.length];
        
        for (int i = 0; i < input.length; i++) {
            l[i] = Integer.parseInt(input[i]);
        }
        
        Arrays.sort(l);
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (l[i] % 2 == 0) {
                ans = 0;
                break;
            } else {
                ans = l[0] * l[1];
            }
        }
        System.out.println(ans);
        
        scanner.close();
    }
}
```

Some key points to notice in the translation:

- We can't use the `list` and `map` functions in Java as we do in Python. Instead, we've created an array to store the integers.
- We read input using Scanner, split the input string by space and parse each part to an integer while storing it in the array `l`.
- We sort the array using `Arrays.sort()`.
- We use a traditional for loop instead of a `range` function.
- We print the result using `System.out.println()`.
- Don't forget to close the Scanner with `scanner.close()` to prevent resource leaks.
