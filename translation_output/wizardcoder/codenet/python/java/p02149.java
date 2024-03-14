Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
S = list(map(int,input().split()))
if S.index(max(S)) == 0:
    print("A")
elif S.index(max(S)) == 1:
    print("B")
elif S.index(max(S)) == 2:
    print("C")

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> S = new ArrayList<>();
        for(String s : sc.nextLine().split(" ")) {
            S.add(Integer.parseInt(s));
        }
        int maxIndex = S.indexOf(Collections.max(S));
        switch(maxIndex) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
```<|endoftext|>
