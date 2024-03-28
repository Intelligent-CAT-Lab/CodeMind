<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def strkn(ans):
    ans.sort(reverse=True)
    return " ".join(str(x) for x in ans)

if __name__ == "__main__":
    ans = [1, 1, 1, 1, 1]
    count = 0
    for line in sys.stdin:
        num = int(line)
        ans[count] = num
        count += 1
        if count == 5:
            print(strkn(ans))
            break
```
Note that the `strkn` function is the same as the one in the Java code, but it is implemented in Python. The rest of the code is similar to the Java code, but it uses Python's built-in `sys` module to read from standard input and `str.join` to join the elements of the list into a string.</s>
