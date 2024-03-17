<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
2


```
l=input().split()
A=int(l[0])
B=int(l[1])
kimawasi=B//A
if B%A>0:
    kimawasi=kimawasi+1
print(kimawasi)

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int kimawasi = B / A;
        if (B % A > 0) {
            kimawasi++;
        }
        System.out.println(kimawasi);
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `split()` method is used to split the input string into an array of strings, where each element is a single number.
* The `parseInt()` method is used to convert each element of the array into an integer.
* The `kimawasi` variable is calculated by dividing `B` by `A`, and then checking if there is any remainder. If there is a remainder, `kimawasi` is incremented by 1.
* The `System.out.println()` method is used to print the final result.

Note: The `kimawasi` variable is not explicitly declared as an integer, but it is inferred to be an integer based on the context.</s>
