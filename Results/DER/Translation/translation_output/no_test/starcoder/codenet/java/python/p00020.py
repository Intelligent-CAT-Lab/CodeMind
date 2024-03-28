<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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

for line in sys.stdin:
    line = line.strip()
    print(line.translate(str.maketrans('abcdefghijklmnopqrstuvwxyz', 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')))
```
"""
<|endoftext|>
