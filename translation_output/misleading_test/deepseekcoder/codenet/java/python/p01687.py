<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def sort(t):
    return ''.join(sorted(t))

def replace_substring(dstr):
    mstr = "AADINNUY"
    nstr = "AIZUNYAN"
    if len(dstr) < 8:
        return dstr
    for i in range(len(dstr)-7):
        t = dstr[i:i+8]
        if sort(mstr) == sort(t):
            dstr = dstr.replace(t, nstr, 1)
            i += 7
    return dstr

def main():
    while True:
        try:
            dstr = input()
            print(replace_substring(dstr))
        except EOFError:
            break

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, checks if the string is at least 8 characters long, and if it is, it replaces any substring of 8 characters that matches the string "AADINNUY" with the string "AIZUNYAN". The replacement is done in lexicographic order. If the string is shorter than 8 characters, it is printed as is. The process continues until the end of the input.
<|EOT|>
