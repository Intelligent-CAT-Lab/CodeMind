Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a = sorted(list(int(i) for i in input().split()) )
b = [1,4,7,9]
if a == b:
 ans ='YES'
else:
 ans ='NO'
print(ans)
```

### Response:
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        for(String s : sc.nextLine().split(" ")) {
            a.add(Integer.parseInt(s));
        }
        Collections.sort(a);
        List<Integer> b = Arrays.asList(1,4,7,9);
        if(a.equals(b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```<|endoftext|>
