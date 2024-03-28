Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
		Arrays.sort(ans, Comparator.reverseOrder()); //???????????????
		String result = ans[0].toString() +" "+ ans[1].toString() +" "+ ans[2].toString() +" "+ ans[3].toString() +" "+ ans[4].toString();
		return result;
	}
}
```

### Response:
```python
import sys

def strkn(ans):
    ans.sort(reverse=True)
    return " ".join(map(str, ans))

if __name__ == '__main__':
    ans = [1,1,1,1,1]
    count = 0
    while True:
        try:
            num = int(input())
            ans[count] = num
            count += 1
            if count == 5:
                print(strkn(ans))
                break
        except EOFError:
            break
```

Explanation:

- We import the `sys` module to read input from the command line.
- We define a function `strkn` that takes an array of integers as input and returns a string containing the sorted integers in reverse order.
- We define a main function that initializes an array `ans` with 5 elements all set to 1.
- We use a `while` loop to read input from the command line until the user enters 5 integers.
- Inside the loop, we use `input()` to read a single integer from the user.
- We use `try-except` to catch the `EOFError` exception that is raised when the user enters a blank line.
- If the user enters a valid integer, we add it to the `ans` array and increment the `count` variable.
- If `count` is equal to 5, we call the `strkn` function to sort the `ans` array and print the result.
- If the user enters a blank line, we break out of the loop and exit the program.<|endoftext|>
