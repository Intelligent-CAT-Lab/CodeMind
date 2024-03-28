<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
needed

Expected output:
6 -76

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


if __name__ == "__main__":
    for line in sys.stdin:
        result_num1, result_num2 = find_duplicates(line.strip())
        print(result_num1, result_num2)
```

This Python code does the same thing as the Java code. It reads lines from the standard input, splits them into characters, and then checks for adjacent or non-adjacent duplicates. The indices of the first and second duplicates are stored in `result_num1` and `result_num2`, respectively. If no duplicates are found, `result_num1` and `result_num2` are set to -1. The results are then printed to the standard output.<｜end▁of▁sentence｜>
