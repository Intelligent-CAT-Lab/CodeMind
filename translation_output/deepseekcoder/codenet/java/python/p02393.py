<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
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
<|EOT|>
