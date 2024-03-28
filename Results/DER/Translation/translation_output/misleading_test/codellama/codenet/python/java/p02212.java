<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 3 4

Expected output:
90

```
l = sorted(list(map(int, input().split())))

print(abs((l[0] + l[3]) - (l[1] + l[2])))

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(numbers);
        int sum1 = numbers[0] + numbers[3];
        int sum2 = numbers[1] + numbers[2];
        System.out.println(Math.abs(sum1 - sum2));
    }
}
```
This code first reads the input from the user, splits it into an array of strings using the `split()` method, and then converts each string to an integer using the `parseInt()` method. The resulting array of integers is then sorted using the `sort()` method.

Next, the code calculates the sum of the first and third elements of the sorted array, and the sum of the second and fourth elements of the sorted array. The difference between these two sums is calculated using the `abs()` method, which returns the absolute value of the difference.

Finally, the code prints the result to the console using the `println()` method.

Note that this code assumes that the input will always be a valid integer, and that the input will always contain exactly four numbers. If these assumptions are not met, the code may not work correctly.</s>
