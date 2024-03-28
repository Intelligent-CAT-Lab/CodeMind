<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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

python code:<fim_suffix><fim_middle>
```python
import sys

def main():
    strNum = sys.stdin.readline()
    strNumList = strNum.split(" ")
    strNumList.sort()
    print(strNumList[0] + " " + strNumList[1] + " " + strNumList[2])

if __name__ == "__main__":
    main()
```
<|endoftext|>
