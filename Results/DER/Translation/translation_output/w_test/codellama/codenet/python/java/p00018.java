<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 6 9 7 5

Expected output:
9 7 6 5 3


```
for a in reversed(sorted(map(int,raw_input().split()))):print a,
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] intNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(intNumbers);
        for (int i = intNumbers.length - 1; i >= 0; i--) {
            System.out.print(intNumbers[i] + " ");
        }
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the console.
* The `nextLine()` method is used to read a line of input from the console.
* The `split()` method is used to split the input string into an array of strings, where each string represents a number.
* The `parseInt()` method is used to convert each string to an integer.
* The `Arrays.sort()` method is used to sort the array of integers in ascending order.
* The `for` loop is used to iterate through the sorted array and print each element in reverse order.

Note: The `Arrays.sort()` method sorts the array in ascending order, so we need to iterate through the array in reverse order to print the elements in descending order.</s>
