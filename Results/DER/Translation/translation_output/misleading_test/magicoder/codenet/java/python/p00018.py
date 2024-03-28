<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

```python
def strkn(ans):
    ans.sort(reverse=True)
    result = ' '.join(map(str, ans))
    return result

if __name__ == "__main__":
    ans = []
    while True:
        try:
            num = int(input())
            ans.append(num)
            if len(ans) == 5:
                print(strkn(ans))
                break
        except EOFError:
            break
```

This Python code does the same thing as the Java code. It reads integers from the standard input, stores them in a list, sorts the list in descending order, and then prints the sorted list. The `try-except` block is used to handle the end of file (EOF) error that might occur if the input is not provided in a timely manner.<｜end▁of▁sentence｜>
