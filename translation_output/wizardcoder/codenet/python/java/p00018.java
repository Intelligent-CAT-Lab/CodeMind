Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
for a in reversed(sorted(map(int,raw_input().split()))):print a,
```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = Arrays.asList(sc.nextLine().split("\\s+"));
        Collections.sort(nums, Collections.reverseOrder());
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
```<|endoftext|>
