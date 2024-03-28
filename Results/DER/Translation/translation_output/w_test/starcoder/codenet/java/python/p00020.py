<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
this is a pen.

Expected output:
THIS IS A PEN.


```
import java.io.*;

public class p00020 {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String s,t;
		char c;
		while((s=bf.readLine())!=null){
			t="";for(int i=0,j=s.length();i<j;i++){c=s.charAt(i);t+=(char)((c>=97&&c<=123)?(c-32):(c));}
			System.out.println(t);
		}
	}
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

while True:
    try:
        s = input()
        t = ""
        for i in range(len(s)):
            c = s[i]
            if c >= 'a' and c <= 'z':
                t += chr(ord(c) - 32)
            else:
                t += c
        print(t)
    except EOFError:
        break
```
<|endoftext|>
