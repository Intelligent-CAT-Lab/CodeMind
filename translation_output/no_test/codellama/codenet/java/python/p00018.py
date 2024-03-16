<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    ans = [1, 1, 1, 1, 1]
    count = 0
    while True:
        try:
            num = int(input())
            ans[count] = num
            count += 1
            if count == 5:
                print(strkn(ans))
                break
        except ValueError:
            break

def strkn(ans):
    ans.sort(reverse=True)
    result = " ".join(str(x) for x in ans)
    return result

if __name__ == "__main__":
    main()
```
Note: The `input()` function in Python 3.x is used to read a line of input from the user, and it returns a string. In the Java code, the `Scanner` class is used to read input from the user, and it returns an `int` value. In Python, we can use the `int()` function to convert the input string to an integer.

Also, in Python, we can use the `join()` method to concatenate a list of strings with a separator. In the Java code, the `String` class has a `join()` method that is used to concatenate a list of strings with a separator. In Python, we can use the `join()` method of the `str` class to concatenate a list of strings with a separator.</s>
