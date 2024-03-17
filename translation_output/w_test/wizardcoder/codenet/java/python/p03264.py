Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
2


```
import java.lang.*;
import java.io.*;
import java.util.*;

class p03264{
	public static void main(String args[]) throws FileNotFoundException{
		FScanner sc=new FScanner();
		//Scanner sc=new Scanner(System.in);
		
		int n=sc.readInt();
		
		
		int o=0;
		int e=0;
		
		for(int i=1; i<=n; i++){
			
			if(i%2==1){
				o+=1;
			}else{
				e+=1;
			}
		}
		System.out.println(o*e);
	}
	
	static void solve(){}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
	
	static void disp(String[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%s ",data[i]);
		}
			System.out.println();
	}
	
	static class FScanner{
		Scanner sc;
		FScanner() throws FileNotFoundException{
			sc=new Scanner(System.in);
		}
		boolean hasNextLine(){
			boolean has=true;
			if(!sc.hasNextLine()){
				has=false;
			}
			return has;
		}
		int readInt(){
			int i=sc.nextInt();
			return i;
		}
		long readLong(){
			long i=Long.parseLong(sc.nextLine());
			return i;
		}
		int[] readIntL(){
			String[] buf=sc.nextLine().split(" ");
			int[] num=new int[buf.length];
			for(int i=0; i<buf.length; i++){
				num[i]=Integer.parseInt(buf[i]);
			}
			return num;
		}
		
		String readString(){
			return sc.nextLine();
		}
		String[] readStringL(String dlm){
			String[] s=sc.nextLine().split(dlm);
			return s;
		}
	}
}

```

### Response:
```python
import java.lang.*;
import java.io.*;
import java.util.*;

class p03264:
    def main(args):
        sc=FScanner()
        n=sc.readInt()
        o=0
        e=0
        for i in range(1,n+1):
            if i%2==1:
                o+=1
            else:
                e+=1
        print(o*e)
        
    def solve():
        pass
    
    def disp(data):
        for i in range(len(data)):
            print(data[i],end=" ")
        print()
        
    def disp(data):
        for i in range(len(data)):
            print(data[i],end=" ")
        print()
        
    class FScanner:
        def __init__(self):
            self.sc=Scanner(System.in)
        def hasNextLine(self):
            has=True
            if not self.sc.hasNextLine():
                has=False
            return has
        def readInt(self):
            i=self.sc.nextInt()
            return i
        def readLong(self):
            i=Long.parseLong(self.sc.nextLine())
            return i
        def readIntL(self):
            buf=self.sc.nextLine().split(" ")
            num=[int(buf[i]) for i in range(len(buf))]
            return num
        def readString(self):
            return self.sc.nextLine()
        def readStringL(self,dlm):
            s=self.sc.nextLine().split(dlm)
            return s
```<|endoftext|>
