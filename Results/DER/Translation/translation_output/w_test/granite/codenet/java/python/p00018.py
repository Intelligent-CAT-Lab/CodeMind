System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
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


Answer:
```python
import sys

def strkn(ans):
    ans.sort(reverse=True)
    return''.join(map(str, ans))

if __name__ == '__main__':
    ans = []
    for line in sys.stdin:
        ans.append(int(line))
        if len(ans) == 5:
            print(strkn(ans))
            break
```

You can write the following test cases to ensure it works correctly:

```python
test_input = """
3
6
9
7
5
"""

expected_output = "9 7 6 5 3"

with patch('sys.stdin', StringIO(test_input)) as mock_stdin:
    output = strkn([])
    assert output == expected_output
```<|endoftext|>
