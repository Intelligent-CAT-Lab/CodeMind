<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
ans=[]
for i in range(n-1):
  if i%2:
    ans+=[(i,0)]
for i in range(n-1):
  if i%6==1:
    for j in range(2,n):
      if j%2==0:
        ans+=[(i,j)]
  if i%6==4:
    for j in range(n):
      if j%2:
        ans+=[(i,j)]
for j in range(n):
  if(n-1+j)%2:
    ans+=[(n-1,j)]
print(len(ans))
for x,y in ans:
  print(x,y)
```

### Response:
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<int[]> ans = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            if (i % 2 != 0) {
                ans.add(new int[]{i, 0});
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (i % 6 == 1) {
                for (int j = 2; j < n; j++) {
                    if (j % 2 == 0) {
                        ans.add(new int[]{i, j});
                    }
                }
            }
            if (i % 6 == 4) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 != 0) {
                        ans.add(new int[]{i, j});
                    }
                }
            }
        }

        for (int j = 0; j < n; j++) {
            if ((n - 1 + j) % 2 != 0) {
                ans.add(new int[]{n - 1, j});
            }
        }

        System.out.println(ans.size());
        for (int[] pair : ans) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, then performs a series of operations based on that integer and prints the results. The operations are similar to the ones in the Python code, but are implemented in Java.
<|EOT|>
