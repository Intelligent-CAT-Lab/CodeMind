Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 4

Expected output:
-70

```
print(len(set(list(map(int, input().split())))))

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
        }
        System.out.println(set.size());
    }
}
```

Explanation:

In Java, we can use the `Scanner` class to read input from the user. We can then use the `nextInt()` method to read integers from the input. We can create an array of integers to store the input.

We can then create a `HashSet` to store the unique integers from the input. We can iterate over the input array and add each element to the `HashSet`. Finally, we can print the size of the `HashSet` to get the number of unique integers in the input.<|endoftext|>
