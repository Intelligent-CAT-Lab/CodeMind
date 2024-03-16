<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

print(len(set(list(map(int, input().split())))))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (String number : numbers) {
            uniqueNumbers.add(Integer.parseInt(number));
        }
        System.out.println(uniqueNumbers.size());
    }
}

This code uses the `Scanner` class to read input from the user, and the `split` method to split the input into an array of strings. The `map` method is used to convert each string to an integer, and the `collect` method is used to collect the integers into a set. Finally, the `size` method is used to print the number of unique integers in the set.</s>
