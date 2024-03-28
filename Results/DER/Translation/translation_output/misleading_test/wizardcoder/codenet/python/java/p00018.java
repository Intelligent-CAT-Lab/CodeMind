Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 6 9 7 5

Expected output:
-52 -29 -61 -57 -88

```
for a in reversed(sorted(map(int,raw_input().split()))):print a,
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
```<|endoftext|>
