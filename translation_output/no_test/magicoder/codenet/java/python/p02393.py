<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
    strNum = sys.stdin.readline().strip()
    strNumList = strNum.split(" ")
    
    strNumList.sort()
    
    intNumSmall = int(strNumList[0])
    intNumMiddle = int(strNumList[1])
    intNumLarge = int(strNumList[2])
    
    print(intNumSmall, intNumMiddle, intNumLarge)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input from the standard input, splits it into a list of strings, sorts the list, and then prints the sorted list.<｜end▁of▁sentence｜>
