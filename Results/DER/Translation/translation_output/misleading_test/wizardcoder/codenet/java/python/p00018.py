Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
    result = " ".join(map(str, ans))
    return result

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

- We import the necessary modules for reading input from the user and sorting the array in reverse order.
- We define a function `strkn` that takes an array `ans` as input and returns a string containing the sorted array elements separated by spaces.
- We initialize an array `ans` with all elements set to 1.
- We use a `while` loop to read input from the user until the user enters 5 integers.
- Inside the loop, we use `input()` to read the next integer from the user.
- We use `try-except` block to handle the case when the user enters `EOFError` (i.e., when there are no more inputs to read).
- We use `int()` to convert the input string to an integer.
- We set the `count` variable to the index of the current element in the `ans` array.
- We use `if` statement to check if we have read 5 integers. If yes, we print the sorted array elements using the `strkn` function.
- We use `break` statement to exit the loop.<|endoftext|>
