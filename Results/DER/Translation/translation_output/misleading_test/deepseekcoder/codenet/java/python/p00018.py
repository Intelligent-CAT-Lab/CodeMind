<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 6 9 7 5

Expected output:
9 7 6 5 3 -100

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

### Response:
```python
def strkn(ans):
    ans.sort(reverse=True)
    result = ' '.join(map(str, ans))
    return result

ans = [1,1,1,1,1]
count = 0
while True:
    num = int(input())
    ans[count] = num
    count += 1
    if count == 5:
        print(strkn(ans))
        break
```

In this Python code, we define a function `strkn` that sorts the input list in descending order and then joins the elements of the list into a string with spaces in between. The main part of the code reads integers from the standard input, stores them in the `ans` list, and when five numbers have been read, it calls `strkn` to print the sorted numbers.
<|EOT|>
