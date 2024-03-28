Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
l = sorted(list(map(int, input().split())))

print(abs((l[0] + l[3]) - (l[1] + l[2])))

```

### Response:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        System.out.println(Math.abs((arr[0] + arr[3]) - (arr[1] + arr[2])));
    }
}
```<|endoftext|>
