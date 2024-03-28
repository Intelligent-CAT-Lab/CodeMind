<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def strkn(ans):
    ans.sort(reverse=True)
    result = ' '.join(map(str, ans))
    return result

ans = [1,1,1,1,1]
count = 0
for num in map(int, input().split()):
    ans[count] = num
    count += 1
    if count == 5:
        print(strkn(ans))
        break
```

This Python code does the same thing as the Java code. It reads five integers from the input, stores them in an array, sorts the array in descending order, and then prints the elements of the array. The `strkn` function is used to convert the array to a string. The `map(int, input().split())` part is used to read the input and convert it to a list of integers. The `join` method is used to convert the list of integers to a string.
<|EOT|>
