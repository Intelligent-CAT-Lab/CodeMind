System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
#Dåé¡
#Dåé¡
import math
N=int(input())
n=int(math.sqrt(N))
plist=[]
for i in range(1,n+1):
    if N%i == 0:
        plist.append(i)
        if i!= int(N/i):
            plist.append(int(N/i))
ans=0
for i in range(len(plist)):
    x=plist[i]
    kari=int(N/x)-1
    if kari == 0:
        pass
    else:
        q=int(N/kari)
        r=N%kari
        if q == r:
            ans+=kari
print(ans)
            

```


Answer:
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n = (int)Math.sqrt(N);
		List<Integer> plist = new ArrayList<>();
		for(int i = 1; i <= n; i++){
		    if(N % i == 0){
		        plist.add(i);
		        if(i!= N/i){
		            plist.add(N/i);
		        }
		    }
		}
		int ans = 0;
		for(int i = 0; i < plist.size(); i++){
		    int x = plist.get(i);
		    int kari = N/x - 1;
		    if(kari == 0){
		        continue;
		    }
		    int q = N/kari;
		    int r = N%kari;
		    if(q == r){
		        ans += kari;
		    }
		}
		System.out.println(ans);
	}
}
```<|endoftext|>
