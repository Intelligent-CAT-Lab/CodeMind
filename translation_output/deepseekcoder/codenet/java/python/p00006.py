<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    str = sys.stdin.readline().strip()
    ret = ""
    for i in range(len(str)):
        ch = str[len(str) - i - 1]
        ret += ch
    print(ret)

if __name__ == "__main__":
    main()
```
<|EOT|>
