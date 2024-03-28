<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8 1

Expected output:
1 3 8


```
s =list(map(int,input().split()))
s1 = sorted(s)
print(str(s1[0])+" "+str(s1[1])+" "+str(s1[2]))


```
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] sortedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sortedNumbers[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(sortedNumbers);
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + " ");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input into an array of strings. The `map()` method is then used to convert each string to an integer, and the resulting array is sorted using the `Arrays.sort()` method. Finally, the sorted array is printed to the console using a loop.

Note that this code assumes that the input will always be a valid integer, and will throw a `NumberFormatException` if the input is not a valid integer. You may want to add additional error handling to handle invalid input.</s>
