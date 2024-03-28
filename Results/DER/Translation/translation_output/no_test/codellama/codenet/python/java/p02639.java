<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

x_list = list(map(int, input().split()))
for i in range(5):
    if x_list[i] == 0:
        print(i+1)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] xList = input.split(" ");
        for (int i = 0; i < xList.length; i++) {
            if (Integer.parseInt(xList[i]) == 0) {
                System.out.println(i + 1);
            }
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split` method to split the input into a list of strings. The `Integer.parseInt` method is used to convert each string in the list to an integer. Finally, the code uses a `for` loop to iterate over the list and print the index of each element that is equal to 0.</s>
