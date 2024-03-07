<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n,x,y = [int(n) for n in input().split()]


ans = [0] * (n-1)

for i in range(n-1):
    for j in range(i+1,n):
        a=j-i
        b=abs((y-1)-j)+abs(i-(x-1))+1
        ans[min(a,b)-1]+=1
for i in ans:
	print(i)        


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] ans = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = j - i;
                int b = Math.abs((y - 1) - j) + Math.abs(i - (x - 1)) + 1;
                ans[Math.min(a, b) - 1] += 1;
            }
        }
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `Math.abs()` method is used to calculate the absolute value of a number. The `Math.min()` method is used to find the minimum of two numbers.</s>
