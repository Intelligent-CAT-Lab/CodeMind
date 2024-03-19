<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
000

Expected output:
-51

```
import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class p01542{
	Scanner sc=new Scanner(System.in);

	int INF=1<<28;
	double EPS=1e-12;

	String s;

	void run(){
		s=sc.nextLine();
		solve();
	}

	char[] cs;
	int max;

	void solve(){
		s+="$";
		cs=s.toCharArray();
		max=-1;
		dfs(0);
		println(max+"");
	}

	void dfs(int i){
		char[] op={'0', '1', '+', '-', '*', '(', ')'};
		if(i==cs.length){
			max=max(max, calc());
			return;
		}
		if(cs[i]=='.'){
			for(char c : op){
				cs[i]=c;
				dfs(i+1);
				cs[i]='.';
			}
		}else{
			dfs(i+1);
		}
	}

	int calc(){
		Result r=E(0);
		r.good&=r.p==cs.length-1;
		if(r.good){
			int n=cs.length;
			for(int i=0; i<n; i++){
				if(cs[i]!='('){
					continue;
				}
				int left=i, right=left+1;
				int stack=0;
				boolean op=false;
				for(; cs[right]!=')'||stack!=0; right++){
					if(cs[right]=='('){
						stack++;
					}else if(cs[right]==')'){
						stack--;
					}
					if(stack==0)
						op|=cs[right]=='+'||cs[right]=='-'||cs[right]=='*';
				}
				r.good&=op;
			}
		}
		return r.good?r.value:-1;
	}

	Result E(int p){
		Result r=F(p);
		if(!r.good){
			return r;
		}
		for(; cs[r.p]=='+'||cs[r.p]=='-';){
			Result r2=F(r.p+1);
			if(!r2.good){
				return r2;
			}
			if(cs[r.p]=='+'){
				r.value+=r2.value;
			}else{
				r.value-=r2.value;
			}
			r.update();
			if(!r.good){
				return r;
			}
			r.p=r2.p;
		}
		return r;
	}

	Result F(int p){
		Result r=T(p);
		if(!r.good){
			return r;
		}
		for(; cs[r.p]=='*';){
			Result r2=T(r.p+1);
			if(!r2.good){
				return r2;
			}
			r.value*=r2.value;
			r.update();
			if(!r.good){
				return r;
			}
			r.p=r2.p;
		}
		return r;
	}

	Result T(int p){
		if(cs[p]=='('){
			Result r=E(p+1);
			if(!r.good||cs[r.p]!=')'){
				r.good=false;
				return r;
			}
			r.p++;
			return r;
		}else if(cs[p]=='0'||cs[p]=='1'){
			Result r=new Result(p, 0);
			for(; Character.isDigit(cs[r.p]); r.p++){
				r.value=r.value*2+cs[r.p]-'0';
				r.update();
			}
			return r;
		}else{
			return new Result(0, -1);
		}
	}

	class Result{
		int p, value;
		boolean good;

		Result(int p, int value){
			this.p=p;
			this.value=value;
			good=true;
			update();
		}

		void update(){
			good&=0<=value&&value<1024;
		}
	}

	void println(String s){
		System.out.println(s);
	}

	public static void main(String[] args){
		new p01542().run();
	}
}
```
[/INST]

Here is the Python code that translates the Java code:
```python
import math

class Result:
    def __init__(self, p, value):
        self.p = p
        self.value = value
        self.good = True
        self.update()

    def update(self):
        self.good = 0 <= self.value < 1024

class p01542:
    def __init__(self):
        self.INF = 1 << 28
        self.EPS = 1e-12
        self.s = ""
        self.cs = []
        self.max = -1

    def run(self):
        self.s = input()
        self.solve()

    def solve(self):
        self.s += "$"
        self.cs = list(self.s)
        self.max = -1
        self.dfs(0)
        print(self.max)

    def dfs(self, i):
        op = ["0", "1", "+", "-", "*", "(", ")"]
        if i == len(self.cs):
            self.max = max(self.max, self.calc())
            return
        if self.cs[i] == ".":
            for c in op:
                self.cs[i] = c
                self.dfs(i + 1)
                self.cs[i] = "."
        else:
            self.dfs(i + 1)

    def calc(self):
        r = self.E(0)
        r.good &= r.p == len(self.cs) - 1
        if r.good:
            n = len(self.cs)
            for i in range(n):
                if self.cs[i] != "(":
                    continue
                left = i
                right = left + 1
                stack = 0
                op = False
                for right in range(right, n):
                    if self.cs[right] == "(":
                        stack += 1
                    elif self.cs[right] == ")":
                        stack -= 1
                    if stack == 0:
                        op |= self.cs[right] == "+" or self.cs[right
