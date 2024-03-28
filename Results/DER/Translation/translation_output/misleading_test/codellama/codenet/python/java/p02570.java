<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 15 80

Expected output:
{N-

```
data=list(map(int,input().split()))
if data[0]/data[1]<=data[2]:
    print('Yes')
else:
    print('No')
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = scanner.nextLine().split(" ").map(Integer::parseInt).toArray(int[]::new);
        if (data[0] / data[1] <= data[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
Note: The `map` method is used to convert the input string to an array of integers, and the `toArray` method is used to convert the `List` object to an array.</s>
