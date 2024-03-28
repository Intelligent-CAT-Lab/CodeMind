<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
needed

Expected output:
2 5


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
def find_duplicates(line):
    str_list = list(line)
    result_num1 = -1
    result_num2 = -1

    for i in range(len(str_list)):
        if i + 1 <= len(str_list) - 1 and str_list[i] == str_list[i + 1]:
            result_num1 = i + 1
            result_num2 = i + 2
            break

        if i + 2 <= len(str_list) - 1 and str_list[i] == str_list[i + 2]:
            result_num1 = i + 1
            result_num2 = i + 3
            break

    return result_num1, result_num2


if __name__ == "__main__":
    line = input()
    result_num1, result_num2 = find_duplicates(line)
    print(result_num1, result_num2)
```

This Python code reads a line of input from the user, converts it to a list of characters, and then calls the `find_duplicates` function to find the positions of any adjacent or separated duplicates. The function returns the positions as two separate variables, which are then printed to the console.
<|EOT|>
