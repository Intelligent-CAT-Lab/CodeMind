<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
    ans = [1, 1, 1, 1, 1]
    count = 0
    while True:
        num = int(input())
        ans[count] = num
        count += 1
        if count == 5:
            print(strkn(ans))
            break
```

This Python code does the same thing as the Java code. It reads five integers from the standard input, sorts them in descending order, and then prints them out.<｜end▁of▁sentence｜>
