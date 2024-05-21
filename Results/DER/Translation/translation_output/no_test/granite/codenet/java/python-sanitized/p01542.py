import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

class Main{
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
		print(max)
	}

	void dfs(int i){
		op=['0', '1', '+', '-', '*', '(', ')']
		if i==len(cs):
			max=max(max, calc())
			return
		if cs[i]=='.':
			for c in op:
				cs[i]=c
				dfs(i+1)
				cs[i]='.'
		else:
			dfs(i+1)
	}

	def calc():
		r=E(0)
		r.good&=r.p==len(cs)-1
		if r.good:
			n=len(cs)
			for i in range(n):
				if cs[i]!='(':
					continue
				left=i
				right=left+1
				stack=0
				op=False
				while cs[right]!=')' or stack!=0:
					right+=1
					if cs[right]=='(':
						stack+=1
					elif cs[right]==')':
						stack-=1
					if stack==0:
						op|=cs[right]=='+' or cs[right]=='-' or cs[right]=='*'
				r.good&=op
		return r.good?r.value:-1

	def E(p):
		r=F(p)
		if not r.good:
			return r
		while cs[r.p]=='+' or cs[r.p]=='-':
			r2=F(r.p+1)
			if not r2.good:
				return r2
			if cs[r.p]=='+':
				r.value+=r2.value
			else:
				r.value-=r2.value
			r.update()
			if not r.good:
				return r
			r.p=r2.p
		return r

	def F(p):
		r=T(p)
		if not r.good:
			return r
		while cs[r.p]=='*':
			r2=T(r.p+1)
			if not r2.good:
				return r2
			r.value*=r2.value
			r.update()
			if not r.good:
				return r
			r.p=r2.p
		return r

	def T(p):
		if cs[p]=='(':
			r=E(p+1)
			if not r.good or cs[r.p]!=')':
				r.good=False
				return r
			r.p+=1
			return r
		elif cs[p]=='0' or cs[p]=='1':
			r=Result(p, 0)
			while Character.isDigit(cs[r.p]):
				r.value=r.value*2+cs[r.p]-'0'
				r.update()
			return r
		else:
			return Result(0, -1)

	class Result:
		def __init__(p, value):
			self.p=p
			self.value=value
			self.good=True
			self.update()

		def update(self):
			self.good&=0<=self.value and self.value<1024

	print(max)

if __name__=='__main__':
	Main().run()