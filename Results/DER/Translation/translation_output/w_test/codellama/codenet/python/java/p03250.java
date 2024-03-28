<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 5 2

Expected output:
53


```
abc = list(map(int, input().split()))
abc.sort()
print(int(str(abc[2]) + str(abc[1])) + abc[0])
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] abc = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            abc[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(abc);
        int result = Integer.parseInt(String.valueOf(abc[2]) + String.valueOf(abc[1])) + abc[0];
        System.out.println(result);
    }
}
```
This code first reads the input from the user, splits it into an array of strings using the `split()` method, and then converts each string to an integer using the `parseInt()` method. The resulting array of integers is then sorted using the `sort()` method, and the sum of the first two elements is calculated using the `parseInt()` method and the `+` operator. Finally, the result is printed to the console using the `println()` method.</s>
