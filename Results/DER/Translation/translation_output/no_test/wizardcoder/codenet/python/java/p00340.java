Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
num = list(map(int,input().split()))
num.sort()
if num[0] == num[1] and num[2] ==num[3]:
    print("yes")
else :
    print("no")

```

### Response:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();
        num = Arrays.asList(Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray());
        Collections.sort(num);
        if(num.get(0) == num.get(1) && num.get(2) == num.get(3)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
```<|endoftext|>
