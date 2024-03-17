Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:

```python
import sys

def main():
    input_str = sys.stdin.readline().strip()
    num_list = input_str.split()
    num_list = sorted(num_list)
    num_small = int(num_list[0])
    num_middle = int(num_list[1])
    num_large = int(num_list[2])
    print(num_small, num_middle, num_large)

if __name__ == '__main__':
    main()
```

In Python, we can use the `sys` module to read input from the standard input stream. We can then use the `strip()` method to remove any leading or trailing whitespace from the input string. We can then use the `split()` method to split the input string into a list of strings, using whitespace as the delimiter. We can then use the `sorted()` function to sort the list in ascending order. Finally, we can use the `int()` function to convert each string in the list to an integer, and then print out the three integers separated by spaces.<|endoftext|>
