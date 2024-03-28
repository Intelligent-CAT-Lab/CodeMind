<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String code = scanner.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] words = code.split(" ");

        for (String word : words) {
            if (word.length() >= 3 && word.length() <= 6) {
                System.out.print(word + " ");
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, removes commas and periods, splits the line into words, and then prints out each word that is between 3 and 6 characters long.<｜end▁of▁sentence｜>
