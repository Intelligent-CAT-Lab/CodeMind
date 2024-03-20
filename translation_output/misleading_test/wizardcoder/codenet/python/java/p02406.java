Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
30

Expected output:
3 6 9 12 13 15 18 23 24 27 30

```
n = int(input())
A = list()
for i in range(1,n+1):
    if i % 3 == 0:
        A.append(i)
    elif "3" in str(i):
        A.append(i)
print(" ", end="")
for i in range(len(A)-1):
    print(A[i], end=" ")
print(A[len(A)-1])


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] A = new int[n];
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                A[i-1] = i;
            } else if (String.valueOf(i).contains("3")) {
                A[i-1] = i;
            }
        }

        System.out.print(" ");
        for (int i = 0; i < n-1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[n-1]);
    }
}
```<|endoftext|>
