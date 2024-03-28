<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def find_duplicates(line):
    str_array = list(line)
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

    return result_num1, result_num2

for line in sys.stdin:
    result_num1, result_num2 = find_duplicates(line.strip())
    print(result_num1, result_num2)
```

This Python code does the same thing as the Java code. It reads lines from standard input, splits each line into a list of characters, and then checks for two-character duplicates. If it finds a duplicate, it prints the indices of the characters and breaks the loop. If it doesn't find any duplicates, it prints "-1 -1".
<|EOT|>
