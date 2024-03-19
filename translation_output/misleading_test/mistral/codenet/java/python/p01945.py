<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import sys

def p01945():
    # TODO èªåçæãããã¡ã½ããã»ã1ã5C99ã5C99ã5C99
    input = sys.stdin.readline()

    while input.count("()") > 0:
        input = input.replace("()", "")

    #System.out.println(input)
    char_list = list(input)

    star_index = 0

    for i in range(len(char_list)):
        if char_list[i] == '*':
            star_index = i

    left = star_index - 1
    right = star_index + 1

    result = 0
    while left >= 0:
        if char_list[left] == '(':
            while right <= len(char_list) - 1:
                if char_list[right] == ')':
                    result += 1
                    break

                right += 1

        left -= 1

    print(result)

if __name__ == "__main__":
    p01945()
```</s>
