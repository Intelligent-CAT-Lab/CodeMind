Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1222

Expected output:
3


```
N = raw_input()
print len([i for i in N if i == '2'])

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int count = 0;
        for(int i=0;i<N.length();i++){
            if(N.charAt(i)=='2'){
                count++;
            }
        }
        System.out.println(count);
    }
}
```<|endoftext|>
