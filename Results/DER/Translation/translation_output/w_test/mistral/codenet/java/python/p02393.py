<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
    # Read input
    strNum = input()
    strNumList = strNum.split()

    # Sort the list
    strNumList.sort()

    # Convert string to integers
    intNumSmall = int(strNumList[0])
    intNumMiddle = int(strNumList[1])
    intNumLarge = int(strNumList[2])

    # Print output
    print(intNumSmall, intNumMiddle, intNumLarge)

if __name__ == "__main__":
    main()
```</s>
