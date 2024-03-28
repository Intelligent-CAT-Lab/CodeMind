<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
        String[] code = input.split(" ");

        List<String> list = new ArrayList<>();

        for (String var : code) {
            if (var.length() >= 3 && var.length() <= 6) {
                list.add(var);
            }
        }

        for (String var : list) {
            System.out.print(var + " ");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, removes commas and periods, splits the input into an array of strings, and then adds any string to a list that is between 3 and 6 characters long. Finally, it prints out the strings in the list.
<|EOT|>
