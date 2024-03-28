Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
    input_stream = sys.stdin
    str_num = input_stream.readline().strip()
    str_num_list = str_num.split()
    str_num_list.sort()
    int_num_small = int(str_num_list[0])
    int_num_middle = int(str_num_list[1])
    int_num_large = int(str_num_list[2])
    print(int_num_small, int_num_middle, int_num_large)

if __name__ == '__main__':
    main()
```<|endoftext|>
