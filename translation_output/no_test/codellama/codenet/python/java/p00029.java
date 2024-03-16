<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a = list(input().split())
print(max(a, key=a.count), max(a, key=len))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code that translates the Python code:
```
import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        int maxCount = 0;
        int maxLength = 0;
        for (String word : words) {
            int count = 0;
            for (String word2 : words) {
                if (word.equals(word2)) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxLength = word.length();
            } else if (count == maxCount && word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        System.out.println(maxCount + " " + maxLength);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split` method to split the input into an array of words. It then iterates over the array of words and counts the number of times each word appears in the input. It also keeps track of the length of the longest word. Finally, it prints the maximum count and the length of the longest word.

Note that this code assumes that the input is a single line of text, and that each word is separated by a space. If the input contains multiple lines or different separators, you will need to modify the code accordingly.</s>
