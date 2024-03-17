<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 4

Expected output:
3


```
print(len(set(list(map(int, input().split())))))

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
        System.out.println(intNumbers.length);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input string into an array of strings. The `map()` method is then used to convert each string in the array to an integer, and the `len()` method is used to get the length of the resulting array. Finally, the length of the array is printed to the console.

Note that this code assumes that the input will be a string of space-separated integers, and that each integer will be a valid integer value. If the input is not in the expected format, the code may throw an exception.</s>
