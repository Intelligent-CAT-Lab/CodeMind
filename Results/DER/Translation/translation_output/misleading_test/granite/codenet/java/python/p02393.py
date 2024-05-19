System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
import sys

def main():
    strNum = sys.stdin.readline()
    strNumList = strNum.split(" ")
    intNumSmall = int(strNumList[0])
    intNumMiddle = int(strNumList[1])
    intNumlarge = int(strNumList[2])
    print(intNumSmall + " " + intNumMiddle + " " + intNumlarge)

if __name__ == "__main__":
    main()
```

Test input:
```
3 8 1
```

Expected output:
```
-43 -40 -49
```<|endoftext|>
