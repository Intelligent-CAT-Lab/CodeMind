<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
2


```
import java.util.*;
import java.io.*;
public class p02625 {

	public static void main(String[] args) throws Exception{
		long num = 1000000007;
		long[] fact = new long[500001];
 		fact[0] = 1;
 		long ans1 = 1;
 		for(int i = 1;i<=500000;i++){
 			ans1= (ans1*i) % num;
 			fact[i] = ans1;
 		}
 		long[] inv = new long[500001];
 		inv[0] = 1;
 		for(int i = 1;i<=500000;i++){
 			inv[i] = power(fact[i], num-2, num)%num;
 		}
		// TODO Auto-generated method stub
 		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
 		PrintWriter out = new PrintWriter(System.out);

	 		StringTokenizer st = new StringTokenizer(bf.readLine());
	 		int n = Integer.parseInt(st.nextToken());
	 		int m = Integer.parseInt(st.nextToken());
	 	
	 	long ans = fact[m] * inv[m-n] %num;
	 	
	 	long anss = 0;
	 	long pos = 1;
	 	for(int i = 1;i<=n;i++){
	 		long prod =1;
	 		prod*=fact[n];
	 		prod%=num;
	 		prod*=inv[i];
	 		prod%=num;
	 		prod*=inv[n-i];
	 		prod%=num;
	 		prod*=fact[m-i];
	 		prod%=num;
	 		prod*=inv[m-n];
	 		prod%=num;
	 		prod*=pos;
	 		anss+=prod;
	 		anss = (anss+num)%num;
	 		pos = -pos;
	 	}
	 	long actualans = 0;
	 	actualans+= ans*ans;
	 	actualans%=num;
	 	actualans-=anss*ans;
	 	actualans%=num;
	 	actualans = (actualans+num)%num;
	 	out.println(actualans);
 		out.close();
 		
 		
 		
 	}
	public static int power(long x, long y, long mod){
		long ans = 1;
		while(y>0){
			if (y%2==1)
				ans = (ans*x)%mod;
			x = (x*x)%mod;
			y/=2;
		}
		return (int)(ans);
	}
	
}
 	
 
//StringJoiner sj = new StringJoiner(" "); 
//sj.add(strings)
//sj.toString() gives string of those stuff w spaces or whatever that sequence is

 		
 		
 		
 		
	



```
[/INST]
```python
import sys

num = 1000000007
fact = [1] * 500001
inv = [1] * 500001

for i in range(1, 500000):
    fact[i] = (fact[i-1] * i) % num
    inv[i] = power(fact[i], num-2, num) % num

n, m = map(int, sys.stdin.readline().split())

ans = fact[m] * inv[m-n] % num

anss = 0
pos = 1
for i in range(1, n+1):
    prod = 1
    prod *= fact[n]
    prod %= num
    prod *= inv[i]
    prod %= num
    prod *= inv[n-i]
    prod %= num
    prod *= fact[m-i]
    prod %= num
    prod *= inv[m-n]
    prod %= num
    prod *= pos
    anss += prod
    anss = (anss + num) % num
    pos = -pos

actualans = 0
actualans += ans * ans
actualans %= num
actualans -= anss * ans
actualans %= num
actualans = (actualans + num) % num

print(actualans)

def power(x, y, mod):
    ans = 1
    while y > 0:
        if y % 2 == 1:
            ans = (ans * x) % mod
        x = (x * x) % mod
        y //= 2
    return int(ans)
```
Note: The code is written in Python 3.x and uses the `sys` module to read input from stdin and write output to stdout. The `power` function is defined separately and is used to calculate the power of a number modulo a modulus. The code assumes that the input is a single line containing two integers `n` and `m`, separated by a space.</s>
