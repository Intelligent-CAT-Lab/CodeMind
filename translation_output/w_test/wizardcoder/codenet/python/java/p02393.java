Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8 1

Expected output:
1 3 8


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
        int[] s = new int[3];
        for(int i=0;i<3;i++){
            s[i] = sc.nextInt();
        }
        Arrays.sort(s);
        System.out.println(s[0]+" "+s[1]+" "+s[2]);
    }
}
```<|endoftext|>
