Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int, input().split())
if sorted(list((a,b,c)))==[5,5,7]:
  print("YES")
else:
  print("NO")
```

### Response:
```java
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    List<Integer> nums = Arrays.asList(a, b, c);
    Collections.sort(nums);
    if (nums.equals(Arrays.asList(5, 5, 7))) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
```<|endoftext|>
