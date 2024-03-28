Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s =list(map(int,input().split()))
s1 = sorted(s)
print(str(s1[0])+" "+str(s1[1])+" "+str(s1[2]))


```

### Response:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> s = new ArrayList<Integer>();
        s = Arrays.asList(sc.nextLine().split("\\s+")).stream().map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> s1 = new ArrayList<Integer>(s);
        Collections.sort(s1);
        System.out.println(s1.get(0)+" "+s1.get(1)+" "+s1.get(2));
    }
}
```<|endoftext|>
