<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
AIDUNYAN

Expected output:
AIZUNYAN


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

@@ Response
Here is the equivalent Python code:

```python
def sort_chars(t):
    return ''.join(sorted(t))

def replace_substring(dstr, mstr, nstr):
    for i in range(len(dstr) - 7):
        t = dstr[i:i+8]
        if sort_chars(mstr) == sort_chars(t):
            dstr = dstr.replace(t, nstr, 1)
            i += 7
    return dstr

def main():
    mstr = "AADINNUY"
    nstr = "AIZUNYAN"
    while True:
        try:
            dstr = input()
            if len(dstr) < 8:
                print(dstr)
                continue
            dstr = replace_substring(dstr, mstr, nstr)
            print(dstr)
        except EOFError:
            break

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, checks if it's less than 8 characters long, and if it is, it prints the string as is. If it's not, it replaces all occurrences of a substring that matches the sorted version of `mstr` with the sorted version of `nstr`. The `try-except` block is used to handle the end of file (EOF) error that might occur when the input is piped from a file.<｜end▁of▁sentence｜>
