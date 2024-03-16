Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.*;

public class p01687:
    def main(self):
        self.run()

    def run(self):
        scan = Scanner(System.in)
        mstr = "AADINNUY"
        nstr = "AIZUNYAN"
        t = "AAAAAAAA".toCharArray()
        tt = ""
        while scan.hasNext():
            dstr = scan.next()
            if len(dstr) < 8:
                print(dstr)
                continue
            for i in range(dstr.length()-7):
                t = dstr.substring(i,i+8).toCharArray()
                tt = String.valueOf(t)
                self.sort(t)
                if mstr.equals(String.valueOf(t)):
                    dstr = dstr.replace(tt,nstr)
                    i += 7
            print(dstr)

    def sort(self, t):
        for i in range(len(t)):
            for j in range(len(t)-1,i,-1):
                if t[i] > t[j]:
                    a = t[i]
                    t[i] = t[j]
                    t[j] = a
        return t
```<|endoftext|>
