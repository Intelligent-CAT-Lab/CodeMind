<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 6 9 7 5

Expected output:
9 7 6 5 3


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class p00018 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		Integer ans[] = {1,1,1,1,1} ;
		int count = 0;
		while (sc.hasNext()) {
			int num = sc.nextInt();
			ans[count] = num;
			count++;
			if(count==5){
				System.out.println(strkn(ans));
				break;
			}
		}
	}
	public static String strkn(Integer[] ans){
		Arrays.sort(ans, Comparator.reverseOrder()); // ???????????????
		String result = ans[0].toString() +" "+ ans[1].toString() +" "+ ans[2].toString() +" "+ ans[3].toString() +" "+ ans[4].toString();
		return result;
	}
}
```
[/INST]
```python
import sys

def main():
    nums = [int(x) for x in sys.stdin.read().split()]
    nums.sort(reverse=True)
    print(" ".join(str(x) for x in nums))

if __name__ == "__main__":
    main()
```
This code reads the input from stdin, sorts it in descending order, and then prints the sorted numbers separated by spaces.

Here's an explanation of the code:

* `sys.stdin.read()` reads the input from stdin and returns it as a string.
* `split()` splits the string into a list of strings, where each string is a number.
* `[int(x) for x in ...]` converts each string to an integer.
* `sort(reverse=True)` sorts the list of integers in descending order.
* `" ".join(str(x) for x in ...)` joins the sorted integers into a string separated by spaces.
* `print()` prints the resulting string.

Note that this code assumes that the input is a list of integers separated by spaces. If the input is in a different format, you may need to modify the code accordingly.</s>
