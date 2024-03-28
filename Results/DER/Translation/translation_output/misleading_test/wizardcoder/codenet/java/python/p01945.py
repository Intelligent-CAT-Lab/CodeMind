Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
((*)())

Expected output:
41

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p01945 {

	public static void main(String[] args) throws IOException {
		// TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		while(str.contains("()")){
			str = str.replaceAll("\\(\\)", "");
		}
		//System.out.println(str);
		char[] input = str.toCharArray();

		int starIndex = 0;

		for(int i = 0; i < input.length; i++){
			if(input[i] == '*'){
				starIndex = i;
			}
		}

		int left = starIndex - 1;
		int right = starIndex + 1;

		int result = 0;
		while(left >= 0){
			if(input[left] == '('){
				while(right <= input.length - 1){
					if(input[right] == ')'){
						result++;
						break;
					}

					right++;
				}
			}

			left--;
		}

		System.out.println(result);
	}

}


```

### Response:
```python
import re

def count_pairs(s):
    while '()' in s:
        s = re.sub(r'\(\)', '', s)
    return len(re.findall(r'\(\)', s))

s = input()
print(count_pairs(s))
```

Explanation:

We can use the `re` module in Python to replace all occurrences of `()` with an empty string using the `sub()` method. We can then count the number of remaining `()` pairs using the `findall()` method.

We can then take the input string from the user and pass it to the `count_pairs()` function. The function will return the number of pairs of `()` in the string. We can then print the result.<|endoftext|>
