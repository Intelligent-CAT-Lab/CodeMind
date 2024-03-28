Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
ret=0
for i in range(len(s)):
    ret+=(i%2)-[0,1][int(s[i]=="p")]
print(ret)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            ret += (i % 2) - (s.charAt(i) == 'p'? 1 : 0);
        }
        System.out.println(ret);
    }
}
```<|endoftext|>
