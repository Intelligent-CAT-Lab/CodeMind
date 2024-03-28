<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Thank you for your mail and your lectures

Expected output:
your lectures 

```
a = list(input().split())
print(max(a, key=a.count), max(a, key=len))

```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String mostFrequentWord = "";
        int maxFrequency = 0;
        for (String word : words) {
            int frequency = 0;
            for (String otherWord : words) {
                if (word.equals(otherWord)) {
                    frequency++;
                }
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentWord = word;
            }
        }
        System.out.println(mostFrequentWord);
    }
}
```
This code uses a similar approach to the Python code, but it uses Java's built-in `Scanner` class to read input from the user, and it uses a `for` loop to iterate over the words in the input string. It also uses a `String` array to store the words and a `String` variable to store the most frequent word.

The code first splits the input string into an array of words using the `split()` method. It then iterates over the words in the array and counts the frequency of each word using a nested `for` loop. The frequency of each word is stored in a variable called `frequency`.

The code then checks if the frequency of the current word is greater than the maximum frequency seen so far. If it is, it updates the maximum frequency and the most frequent word.

Finally, the code prints the most frequent word to the console.

Note that this code assumes that the input string contains only words separated by spaces. If the input string contains other characters, such as punctuation or special characters, the code may not work correctly.</s>
