Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10000

Expected output:
3


```
n = int(input())

result = []
for i in range(1, int(n**(1/2)+1)):
    if n%i==0:
        result.append(max(len(str(i)), len(str(n//i))))
print(min(result))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int result = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result = Math.max(result, Math.max(String.valueOf(i).length(), String.valueOf(n/i).length()));
            }
        }
        System.out.println(result);
    }
}
```<|endoftext|>
