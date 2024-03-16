<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    ans = [1, 1, 1, 1, 1]
    count = 0
    for line in sys.stdin:
        num = int(line)
        ans[count] = num
        count += 1
        if count == 5:
            print(strkn(ans))
            break

def strkn(ans):
    ans.sort(reverse=True)
    result = ' '.join(map(str, ans))
    return result

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads five integers from the standard input, stores them in an array, sorts the array in descending order, and then prints the elements of the array. The `strkn` function is used to convert the array to a string. The `main` function is the entry point of the program.
<|EOT|>
