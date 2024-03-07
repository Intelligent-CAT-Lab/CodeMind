<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

for a in reversed(sorted(map(int,raw_input().split()))):print a,

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class ReverseSortedMap {
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
This code uses the `Scanner` class to read input from the user, and the `split` method to split the input into an array of strings. The `parseInt` method is used to convert each string to an integer. The `sort` method is used to sort the array of integers in ascending order, and the `reverse` method is used to reverse the order of the array. Finally, the `print` method is used to print the sorted and reversed array.</s>
