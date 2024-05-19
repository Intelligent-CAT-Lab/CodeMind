System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] A = new int[n];
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                A[count] = i;
                count++;
            }
        }
        for (int i = 0; i < count - 1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[count - 1]);
    }
}
```

You can run this code with a sample test case to verify that it produces the expected output:

```
Input:
30

Output:
3 6 9 12 13 15 18 23 24 27 30
```<|endoftext|>
