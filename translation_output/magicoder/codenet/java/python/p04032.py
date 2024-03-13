<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.IOException;
import java.util.Scanner;

public class p04032 {
	public static void main(String[] args) throws IOException {
		Scanner cin = new Scanner(System.in);
		String line;
		for (; cin.hasNext();) {
			line = cin.nextLine();

			String[] strArray = line.split("");
			int resultNum1 = -1;
			int resultNum2 = -1;

			for(int i =0; i < strArray.length; i++){

				if(i + 1 <= strArray.length - 1 && strArray[i].equals(strArray[i + 1])){
					resultNum1 = i + 1;
					resultNum2 = i + 2;
					break;
				}


				if(i + 2 <= strArray.length - 1 && strArray[i].equals(strArray[i + 2])){
					resultNum1 = i + 1;
					resultNum2 = i + 3;
					break;
				}
			}


			System.out.println(resultNum1 + " " + resultNum2);
		}
	}
}
```

@@ Response
```python
import sys

for line in sys.stdin:
    str_array = list(line.strip())
    result_num1 = -1
    result_num2 = -1

    for i in range(len(str_array)):
        if i + 1 <= len(str_array) - 1 and str_array[i] == str_array[i + 1]:
            result_num1 = i + 1
            result_num2 = i + 2
            break

        if i + 2 <= len(str_array) - 1 and str_array[i] == str_array[i + 2]:
            result_num1 = i + 1
            result_num2 = i + 3
            break

    print(result_num1, result_num2)
```

This Python code does the same thing as the Java code. It reads lines from the standard input, splits them into characters, and then checks for adjacent or two-character repeating characters. If it finds one, it prints the positions of the characters. If it doesn't find any, it prints -1.<｜end▁of▁sentence｜>
