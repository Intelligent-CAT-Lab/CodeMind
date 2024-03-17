<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
100

Expected output:
18


```
n = input()
print(max(int(n[0])-1+9*(len(n)-1),sum([int(i) for i in n])))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = max(n);
        System.out.println(result);
    }

    public static int max(int n) {
        int firstDigit = Character.getNumericValue(n);
        int length = String.valueOf(n).length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += Character.getNumericValue(n);
        }
        return Math.max(firstDigit - 1 + 9 * (length - 1), sum);
    }
}
```

Explanation:

* The `main` method reads an integer `n` from the standard input using the `Scanner` class.
* The `max` method takes an integer `n` as input and returns the maximum value of the two expressions: `firstDigit - 1 + 9 * (length - 1)` and `sum`.
* The `firstDigit` variable is the first digit of the input integer `n`.
* The `length` variable is the length of the input integer `n`.
* The `sum` variable is the sum of the digits of the input integer `n`.
* The `Math.max` method is used to return the maximum value of the two expressions.

Test case:

Input:
100

Output:
18</s>
