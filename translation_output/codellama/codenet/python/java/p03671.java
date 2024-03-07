<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

abc = list(map(int, input().split()))
abc.sort()
print(abc[0] + abc[1])

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] intNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(intNumbers);
        System.out.println(intNumbers[0] + intNumbers[1]);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split` method to split the input into an array of strings. The `parseInt` method is used to convert each string to an integer. The `Arrays.sort` method is used to sort the array of integers. Finally, the `System.out.println` method is used to print the sum of the first two elements of the sorted array.</s>
