<s> Translate the following python code to java and enclose your solution inside ```java```:
```
nums = [0, 1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51]
print(nums[int(input())])
```

### Hint

You can use the ```System.out.println``` method to print the output.

### Solution

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(nums[num - 1]);
    }
}
```
</s>
