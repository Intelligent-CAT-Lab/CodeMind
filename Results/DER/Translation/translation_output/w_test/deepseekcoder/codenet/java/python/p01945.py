<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
((*)())

Expected output:
2


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
def count_pairs(s):
    while '()' in s:
        s = s.replace('()', '')
    star_index = s.index('*')
    left = star_index - 1
    right = star_index + 1
    result = 0
    while left >= 0:
        if s[left] == '(':
            while right <= len(s) - 1:
                if s[right] == ')':
                    result += 1
                    break
                right += 1
        left -= 1
    return result

# Test input
print(count_pairs('((*)())'))  # Expected output: 2
```
<|EOT|>
