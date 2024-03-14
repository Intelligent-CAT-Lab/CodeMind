Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
print(len(set(list(map(int, input().split())))))

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = Arrays.asList(sc.nextLine().split("\\s")).stream().map(Integer::parseInt).collect(Collectors.toList());
        Set<Integer> uniqueNums = new HashSet<>(nums);
        System.out.println(uniqueNums.size());
    }
}
```<|endoftext|>
