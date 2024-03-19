<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Rain, rain, go to Spain.

Expected output:
rain Spain

```
code = raw_input()
code = code.replace(",","")
code = code.replace(".","")
code = code.split()
	
list = []
	
for var in code:
	if len(var) >= 3 and len(var) <= 6:
		list.append(var)
			
for var in list:
	print var,
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(",");
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            String word = words[i].trim();
            if (word.length() >= 3 && word.length() <= 6) {
                result[i] = word;
            }
        }
        for (String word : result) {
            System.out.print(word + " ");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input string into an array of words. It then iterates over the array of words and checks if each word is between 3 and 6 characters long. If it is, it adds it to a new array of strings called `result`. Finally, it iterates over the `result` array and prints each word followed by a space.</s>
