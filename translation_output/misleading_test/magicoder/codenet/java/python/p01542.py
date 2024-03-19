<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Python version of the given Java code:

```python
import re

class Result:
    def __init__(self, p, value):
        self.p = p
        self.value = value
        self.good = True
        self.update()

    def update(self):
        self.good &= 0 <= self.value < 1024

def E(p, cs):
    r = F(p, cs)
    if not r.good:
        return r
    while cs[r.p] == '+' or cs[r.p] == '-':
        r2 = F(r.p + 1, cs)
        if not r2.good:
            return r2
        if cs[r.p] == '+':
            r.value += r2.value
        else:
            r.value -= r2.value
        r.update()
        if not r.good:
            return r
        r.p = r2.p
    return r

def F(p, cs):
    r = T(p, cs)
    if not r.good:
        return r
    while cs[r.p] == '*':
        r2 = T(r.p + 1, cs)
        if not r2.good:
            return r2
        r.value *= r2.value
        r.update()
        if not r.good:
            return r
        r.p = r2.p
    return r

def T(p, cs):
    if cs[p] == '(':
        r = E(p + 1, cs)
        if not r.good or cs[r.p] != ')':
            r.good = False
            return r
        r.p += 1
        return r
    elif cs[p] == '0' or cs[p] == '1':
        r = Result(p, 0)
        while p < len(cs) and cs[r.p].isdigit():
            r.value = r.value * 2 + int(cs[r.p])
            r.update()
            r.p += 1
        return r
    else:
        return Result(0, -1)

def solve(s):
    s += "$"
    cs = list(s)
    max_val = -1
    dfs(0, cs, max_val)
    print(max_val)

def dfs(i, cs, max_val):
    op = ['0', '1', '+', '-', '*', '(', ')']
    if i == len(cs):
        max_val = max(max_val, calc(cs))
        return max_val
    if cs[i] == '.':
        for c in op:
            cs[i] = c
            max_val = dfs(i + 1, cs,
