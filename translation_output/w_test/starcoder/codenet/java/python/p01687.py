<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

def sort(t):
    for i in range(len(t)):
        for j in range(len(t)-1,i,-1):
            if t[i] > t[j]:
                t[i],t[j] = t[j],t[i]
    return t

def main():
    mstr = "AADINNUY"
    nstr = "AIZUNYAN"
    while True:
        try:
            dstr = sys.stdin.readline().strip()
            if len(dstr) < 8:
                print(dstr)
                continue
            for i in range(len(dstr)-7):
                t = dstr[i:i+8]
                if mstr == sort(t):
                    dstr = dstr.replace(t,nstr)
                    i += 7
            print(dstr)
        except:
            break

if __name__ == "__main__":
    main()
```
<|endoftext|>
