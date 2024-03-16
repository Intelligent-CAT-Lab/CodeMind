<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p00006 {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String ret = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(str.length() - i - 1);
			ret += ch;
		}
		System.out.println(ret);
	}
}
```
[/INST]
```python
import sys

def main():
    # Read input from user
    str = input()
    
    # Initialize empty string to store reversed string
    ret = ""
    
    # Loop through each character in the string
    for i in range(len(str)):
        # Append current character to the end of reversed string
        ret += str[i]
    
    # Print reversed string
    print(ret)

if __name__ == "__main__":
    main()
```</s>
