<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 8 1

Expected output:
-43 -40 -49

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

@@ Response
```python
import sys

def main():
    nums = list(map(int, sys.stdin.readline().split()))
    nums.sort()
    print(nums[0], nums[1], nums[2])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three numbers from the standard input, sorts them, and then prints them out. The `map(int, sys.stdin.readline().split())` line is equivalent to the `strNumList = strNum.split(" ")` line in the Java code, and the `nums.sort()` line is equivalent to the `Arrays.sort(strNumList)` line. The `print(nums[0], nums[1], nums[2])` line is equivalent to the `System.out.println(intNumSmall + " " + intNumMiddle + " " + intNumlarge)` line.<｜end▁of▁sentence｜>
