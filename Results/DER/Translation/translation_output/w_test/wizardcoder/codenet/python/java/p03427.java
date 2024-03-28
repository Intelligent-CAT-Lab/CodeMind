Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
18


```
n = input()
print(max(int(n[0])-1+9*(len(n)-1),sum([int(i) for i in n])))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n.length();i++){
            sum+=n.charAt(i)-'0';
        }
        System.out.println(Math.max(sum-9,sum-1));
    }
}
```<|endoftext|>
