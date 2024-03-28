<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 8 1

Expected output:
1 3 8


```
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

```
[/INST]
```python
import sys

def main():
    nums = sys.stdin.readline().split()
    nums.sort()
    print(" ".join(nums))

if __name__ == "__main__":
    main()
```
This code reads a line of input from stdin, splits it into a list of strings, sorts the list, and then joins the sorted list back into a single string and prints it to stdout.

Here's an example of how you can test this code:
```
$ python3 test.py
3 8 1
1 3 8
```
This will read the input "3 8 1" from stdin, sort it, and then print the sorted list "1 3 8" to stdout.</s>
