<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int[] ans = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = j - i;
                int b = Math.abs((y - 1) - j) + Math.abs(i - (x - 1)) + 1;
                ans[Math.min(a, b) - 1]++;
            }
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, then it creates an array of size `n-1` and initializes it with zeros. Then it iterates over the array and for each pair of indices `i` and `j`, it calculates `a` and `b`, and increments the element at index `min(a,b)-1` in the `ans` array. Finally, it prints each element of the `ans` array.<｜end▁of▁sentence｜>
