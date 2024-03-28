Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 4

Expected output:
1


```
n, k = map(int, input().split())

rot = n//k
x = n

if k == 1 or n == k or n%k == 0:
  x = 0
elif rot >= 1:
  x = n - k*rot
  
t = x%k

print(min(t, abs(t-k)))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rot = n/k;
        int x = n;
        if(k == 1 || n == k || n%k == 0){
            x = 0;
        }
        else if(rot >= 1){
            x = n - k*rot;
        }
        int t = x%k;
        System.out.println(Math.min(t, Math.abs(t-k)));
    }
}
```<|endoftext|>
