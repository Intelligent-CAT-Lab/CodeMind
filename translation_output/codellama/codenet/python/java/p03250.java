<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

abc = list(map(int, input().split()))
abc.sort()
print(int(str(abc[2]) + str(abc[1])) + abc[0])

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
        int sum = intNumbers[2] + intNumbers[1] + intNumbers[0];
        System.out.println(sum);
    }
}
```
This code first reads the input from the user using the `Scanner` class. It then splits the input into an array of strings using the `split` method. It then converts each string to an integer using the `Integer.parseInt` method and stores it in an array of integers.

Next, it sorts the array of integers using the `Arrays.sort` method. Finally, it calculates the sum of the first three elements of the sorted array and prints it to the console using the `System.out.println` method.

Note that the Python code uses the `map` function to convert the input to an array of integers, but in Java, we can use the `Integer.parseInt` method to convert each string to an integer.</s>
