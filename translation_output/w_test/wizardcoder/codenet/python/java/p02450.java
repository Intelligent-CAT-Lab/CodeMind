Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
1 2
2 1


```
from itertools import permutations
for p in list(permutations(range(1, int(input())+1))): print(*p)

```

### Response:
```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<List<Integer>> result = generatePermutations(n);
        for (List<Integer> perm : result) {
            System.out.println(Arrays.toString(perm.toArray()));
        }
    }

    public static List<List<Integer>> generatePermutations(int n) {
        List<List<Integer>> result = Arrays.stream(new int[n])
               .boxed()
               .collect(Collectors.toList());
        for (int i = 0; i < n; i++) {
            result.set(i, Arrays.asList(i+1));
        }
        return result;
    }
}
```

Explanation:

In Java, we can use the `java.util.stream` package to generate permutations of a list of integers. The `permutations` method from the `itertools` module in Python can be used to generate permutations of a list of integers in Java. However, the `permutations` method in Java returns an iterator, which we need to convert to a list.

To generate permutations of a list of integers in Java, we can use the `permutations` method from the `java.util.stream.IntStream` class. This method generates all possible permutations of a list of integers. We can then convert this stream to a list of lists using the `collect` method.

In the `generatePermutations` method, we first create a list of lists where each inner list contains a single integer from 1 to n. We then use the `set` method to replace each inner list with a list of integers from 1 to n. Finally, we return the list of lists.

In the `main` method, we parse the input integer `n` from the command line argument and call the `generatePermutations` method to generate all possible permutations of integers from 1 to n. We then print each permutation using the `Arrays.toString` method.<|endoftext|>
