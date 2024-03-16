<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n,x,y = [int(n) for n in input().split()]


ans = [0] * (n-1)

for i in range(n-1):
    for j in range(i+1,n):
        a=j-i
        b=abs((y-1)-j)+abs(i-(x-1))+1
        ans[min(a,b)-1]+=1
for i in ans:
	print(i)        

```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int[] ans = new int[n-1];

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int a = j-i;
                int b = Math.abs((y-1)-j) + Math.abs(i-(x-1)) + 1;
                ans[Math.min(a,b)-1] += 1;
            }
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the input, initializes an array of size `n-1` with all elements set to 0, and then fills the array with the results of the nested loops. Finally, it prints out the elements of the array.
<|EOT|>
