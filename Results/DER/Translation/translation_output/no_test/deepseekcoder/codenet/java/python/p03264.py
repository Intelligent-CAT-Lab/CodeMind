<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

class FScanner:
    def __init__(self):
        self.sc = sys.stdin

    def has_next_line(self):
        return self.sc.readline() != ''

    def read_int(self):
        return int(self.sc.readline())

    def read_long(self):
        return long(self.sc.readline())

    def read_int_l(self):
        return list(map(int, self.sc.readline().split()))

    def read_string(self):
        return self.sc.readline().strip()

    def read_string_l(self, dlm):
        return self.sc.readline().split(dlm)


def main():
    sc = FScanner()

    n = sc.read_int()

    o = 0
    e = 0

    for i in range(1, n + 1):
        if i % 2 == 1:
            o += 1
        else:
            e += 1

    print(o * e)


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, counts the number of odd and even numbers up to that integer, and then prints the product of these two counts.
<|EOT|>
