<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
AIDUNYAN

Expected output:
AIUNYAN

```
import java.util.*;
public class p01687{
	public static void main(String[] args){
		new p01687().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		String mstr = "AADINNUY";
		String nstr = "AIZUNYAN";
		char[] t = "AAAAAAAA".toCharArray();
		String tt = "";
		while(scan.hasNext()){
			String dstr = scan.next();
			if(dstr.length() < 8){
				System.out.println(dstr);
				continue;
			}
			for(int i = 0;i < dstr.length()-7;i++){
				t = dstr.substring(i,i+8).toCharArray();
				tt = String.valueOf(t);
				sort(t);
				if(mstr.equals(String.valueOf(t))){
					dstr = dstr.replace(tt,nstr);
					i += 7;
				}
			}
			System.out.println(dstr);	
		}
	}
	public char[] sort(char[] t){
		for(int i = 0;i < t.length;i++){
			for(int j = t.length-1;j > i;j--){
				if(t[i] > t[j]){
					char a = t[i];
					t[i] = t[j];
					t[j] = a;				
				}
			}
		}
		return t;
	}
}
```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

def main():
    mstr = "AADINNUY"
    nstr = "AIZUNYAN"
    t = "AAAAAAAA"
    tt = ""
    for line in sys.stdin:
        dstr = line.strip()
        if len(dstr) < 8:
            print(dstr)
            continue
        for i in range(len(dstr) - 7):
            t = dstr[i:i+8]
            tt = "".join(t)
            sort(t)
            if mstr == "".join(t):
                dstr = dstr.replace(tt, nstr)
                i += 7
        print(dstr)

def sort(t):
    for i in range(len(t)):
        for j in range(len(t) - 1, i, -1):
            if t[i] > t[j]:
                t[i], t[j] = t[j], t[i]
    return t

if __name__ == "__main__":
    main()
```
Note that the `sort` function is implemented differently in Python than in Java, as Python does not have a built-in `sort` function. Instead, we use a nested loop to iterate over the characters in the string and swap them if necessary.</s>
