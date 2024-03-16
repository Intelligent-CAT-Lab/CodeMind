<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import java.lang
import java.io
import java.util

class p03264:
    def main(self, args):
        sc = FScanner()
        n = sc.readInt()
        o = 0
        e = 0
        for i in range(1, n+1):
            if i % 2 == 1:
                o += 1
            else:
                e += 1
        print(o*e)

    def solve(self):
        pass

    def disp(self, data):
        for i in range(len(data)):
            print(data[i], end=" ")
        print()

    def disp(self, data):
        for i in range(len(data)):
            print(data[i], end=" ")
        print()

    class FScanner:
        def __init__(self):
            self.sc = Scanner(System.in)

        def hasNextLine(self):
            return self.sc.hasNextLine()

        def readInt(self):
            return self.sc.nextInt()

        def readLong(self):
            return Long.parseLong(self.sc.nextLine())

        def readIntL(self):
            buf = self.sc.nextLine().split(" ")
            num = [int(i) for i in buf]
            return num

        def readString(self):
            return self.sc.nextLine()

        def readStringL(self, dlm):
            s = self.sc.nextLine().split(dlm)
            return s
```
Note that the `FScanner` class is not implemented in Python, as it is not a built-in class in Python. However, you can use the `Scanner` class from the `java.util` package to achieve a similar functionality.</s>
