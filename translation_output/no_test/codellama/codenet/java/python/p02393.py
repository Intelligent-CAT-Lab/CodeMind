<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p02393 {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String strNum = br.readLine();
		String[] strNumList = strNum.split(" ");
		
		Arrays.sort(strNumList);
		
		int intNumSmall = Integer.parseInt(strNumList[0]);
		int intNumMiddle = Integer.parseInt(strNumList[1]);
		int intNumlarge = Integer.parseInt(strNumList[2]);
		
		System.out.println(intNumSmall + " " + intNumMiddle + " " + intNumlarge);
	}
}


Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    str_num = sys.stdin.readline().strip()
    str_num_list = str_num.split(" ")
    str_num_list.sort()
    int_num_small = int(str_num_list[0])
    int_num_middle = int(str_num_list[1])
    int_num_large = int(str_num_list[2])
    print(int_num_small, int_num_middle, int_num_large)

if __name__ == "__main__":
    main()
```
This is the equivalent Python code for the given Java code. The `sys` module is used to read input from the standard input stream, and the `strip()` method is used to remove any trailing newline characters from the input string. The `split()` method is used to split the input string into a list of strings, and the `sort()` method is used to sort the list. The `int()` function is used to convert the strings in the list to integers. Finally, the `print()` function is used to print the sorted integers.</s>
