<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2 4

Expected output:
5
4
1
0
25

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
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int[] ans = new int[n-1];

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int a = j-i;
                int b = Math.abs((y-1)-j) + Math.abs(i-(x-1)) + 1;
                ans[Math.min(a, b)-1] += 1;
            }
        }

        for (int i : ans) {
            System.out.println(i);
        }
    }
}
```
This code first reads the input from the user, which is the number of elements `n`, the starting index `x`, and the ending index `y`. It then initializes an array `ans` of size `n-1` to store the number of elements that satisfy the condition.

The outer loop iterates over the elements of the array, and the inner loop iterates over the elements of the array starting from the current element. The variables `a` and `b` are used to store the difference between the current element and the next element, and the absolute difference between the current element and the ending index, respectively. The minimum of `a` and `b` is used to index the `ans` array, and the value at that index is incremented by 1.

Finally, the `ans` array is printed to the console.</s>
