<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    for line in sys.stdin:
        line = line.strip()
        str_array = line.split("")
        result_num1 = -1
        result_num2 = -1

        for i in range(len(str_array)):
            if i + 1 < len(str_array) and str_array[i] == str_array[i + 1]:
                result_num1 = i + 1
                result_num2 = i + 2
                break

            if i + 2 < len(str_array) and str_array[i] == str_array[i + 2]:
                result_num1 = i + 1
                result_num2 = i + 3
                break

        print(result_num1, result_num2)

if __name__ == "__main__":
    main()
```
This is the Python code that translates the Java code you provided. It uses the `sys` module to read input from stdin and the `strip` method to remove any trailing newline characters from the input. The rest of the code is similar to the Java code, with the exception of the `range` function being used instead of the `for` loop with a condition.</s>
