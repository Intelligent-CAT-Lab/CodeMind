<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

class p01687:
    def __init__(self):
        self.mstr = "AADINNUY"
        self.nstr = "AIZUNYAN"

    def run(self):
        for line in sys.stdin:
            dstr = line.strip()
            if len(dstr) < 8:
                print(dstr)
                continue
            for i in range(len(dstr)-7):
                t = dstr[i:i+8]
                if self.mstr == "".join(sorted(t)):
                    dstr = dstr.replace(t, self.nstr)
                    i += 7
            print(dstr)

if __name__ == "__main__":
    p01687().run()
```

This Python code does the same thing as the Java code. It reads lines from the standard input, checks each line for substrings of length 8 that are in alphabetical order, and replaces those substrings with a different string. The result is printed to the standard output.
<|EOT|>
