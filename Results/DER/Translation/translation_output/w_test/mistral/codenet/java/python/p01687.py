<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
def sort(arr):
    for i in range(len(arr)):
        for j in range(len(arr)-i-1):
            if arr[i] > arr[j]:
                arr[i], arr[j] = arr[j], arr[i]

def p01687():
    mstr = "AADINNUY"
    nstr = "AIZUNYAN"
    t = "AAAAAAAA"
    while True:
        dstr = input()
        if len(dstr) < 8:
            print(dstr)
            continue
        for i in range(len(dstr)-7):
            t = dstr[i:i+8]
            tt = str(t)
            sort(t)
            if mstr == tt:
                dstr = dstr[:i] + nstr + dstr[i+8:]
                break
        print(dstr)

p01687()
```</s>
