<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Rain, rain, go to Spain.

Expected output:
Rain rain Spain


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

### Response:
```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.replace(",", "");
        input = input.replace(".", "");
        String[] words = input.split(" ");

        List<String> list = new ArrayList<>();

        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 6) {
                list.add(word);
            }
        }

        for (String word : list) {
            System.out.print(word + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, removes commas and periods, splits the input into words, and then prints out the words that are between 3 and 6 characters long.
<|EOT|>
