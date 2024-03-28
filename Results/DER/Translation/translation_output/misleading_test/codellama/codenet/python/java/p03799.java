<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 6

Expected output:
-67

```
def INT():
    return int(input())

def MI():
    return map(int, input().split())

def LI():
    return list(map(int, input().split()))

N, M = MI()

if 2 * N <= M:
    ans = N + (M - 2 * N) // 4
    
else:
    ans = M // 2
    
print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ans;

        if (2 * N <= M) {
            ans = N + (M - 2 * N) / 4;
        } else {
            ans = M / 2;
        }

        System.out.println(ans);
    }
}
```
Note: The `Scanner` class is used to read input from the user. The `nextInt()` method is used to read an integer value from the user. The `nextLine()` method is used to read a line of text from the user. The `split()` method is used to split a string into an array of strings based on a delimiter. The `map()` method is used to apply a function to each element of an array. The `list()` method is used to convert an array into a list.</s>
