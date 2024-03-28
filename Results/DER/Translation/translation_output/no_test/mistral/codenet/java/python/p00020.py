<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def main():
    with open(sys.stdin, 'r') as f:
        while True:
            s = f.readline()
            if s is None:
                break
            t = ""
            for i, c in enumerate(s):
                t += chr(((ord(c) >= 97 and ord(c) <= 123) ? (ord(c) - 32) : ord(c)))
            print(t)

if __name__ == "__main__":
    main()
```</s>
