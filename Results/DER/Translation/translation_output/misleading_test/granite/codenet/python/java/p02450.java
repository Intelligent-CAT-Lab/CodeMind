System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
Here's the Java code equivalent to the given Python code:

```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        permutations(arr, 0, n - 1);
    }

    public static void permutations(int[] arr, int l, int r) {
        if (l == r) {
            System.out.println(Arrays.toString(arr));
        } else {
            for (int i = l; i <= r; i++) {
                int temp = arr[l];
                arr[l] = arr[i];
                arr[i] = temp;
                permutations(arr, l + 1, r);
                temp = arr[l];
                arr[l] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
```

You can test this code with the following test case:

```java
public class MainTest {
    @Test
    public void testPermutations() {
        String[] expectedOutput = {"[1, 2]", "[2, 1]"};
        Main.main(new String[]{"2"});
        String[] actualOutput = System.out.toString().split("\\s+");
        Arrays.sort(actualOutput);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}
```<|endoftext|>
