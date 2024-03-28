<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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

python code:<fim_suffix><fim_middle>
```python
import sys

def main():
    str = sys.stdin.readline()
    ret = ""
    for i in range(len(str)):
        ret += str[len(str) - i - 1]
    print(ret)

if __name__ == "__main__":
    main()
```
"""
<|endoftext|>
