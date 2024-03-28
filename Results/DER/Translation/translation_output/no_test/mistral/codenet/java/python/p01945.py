<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    # TODO èªåçæãããã¡ã½ããã»ã¹ã¿ã
    br = sys.stdin

    str = br.readline()

    while(str.contains("()")):
        str = str.replaceAll("\\(\\)", "")

    #System.out.println(str)
    char_array = str.tochar()

    star_index = 0

    for i in range(len(char_array)):
        if char_array[i] == '*':
            star_index = i

    left = star_index - 1
    right = star_index + 1

    result = 0
    while left >= 0:
        if char_array[left] == '(':
            while right <= len(char_array) - 1:
                if char_array[right] == ')':
                    result += 1
                    break

                right += 1
            left -= 1
        else:
            left -= 1

    print(result)

if __name__ == "__main__":
    main()
```</s>
