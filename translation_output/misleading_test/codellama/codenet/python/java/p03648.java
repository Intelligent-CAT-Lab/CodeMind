<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
84
3''1LZ'

```
K=int(input())
print(50)
a,b=K//50,K%50
ans=[]
for i in range(50-b):
  ans.append(str(a+i))
  
for i in range(b):
  ans.append(str(a+50-b+i+1))
  
print(" ".join(ans))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.close();

        int a = K / 50;
        int b = K % 50;
        String[] ans = new String[50 - b];

        for (int i = 0; i < 50 - b; i++) {
            ans[i] = String.valueOf(a + i);
        }

        for (int i = 0; i < b; i++) {
            ans[50 - b + i] = String.valueOf(a + 50 - b + i + 1);
        }

        System.out.println(String.join(" ", ans));
    }
}
```
This code first reads an integer `K` from the input, and then calculates the values of `a` and `b` based on the value of `K`. It then initializes an array `ans` of strings with the length of `50 - b`, and fills it with the values of `a + i` for `i` from `0` to `50 - b - 1`. Finally, it prints the contents of the array `ans` joined by spaces.

Note that the code uses the `String.join()` method to join the elements of the array `ans` into a single string, and the `String.valueOf()` method to convert the integer values to strings.</s>
