Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter; 
import java.util.*; 
 

class p03892{ 
	static long gcd(long a, long b){
		if(b==0)return a;
		return gcd(b, a%b);
	}

	static void solve(){ 
		long a = ni(), b=ni();
		a=Math.abs(ni()-a);
		b=Math.abs(ni()-b);
		long g = gcd(a, b);
		long ans = a/g + b/g -1;
		out.println(ans*g);
	} 
 
 
 
 
	 public static void main(String[] args){ 
		 solve(); 
		 out.flush(); 
	 } 
	 private static InputStream in = System.in; 
	 private static PrintWriter out = new PrintWriter(System.out); 
 
	 static boolean inrange(int y, int x, int h, int w){ 
		 return y>=0 && y<h && x>=0 && x<w; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static<T extends Comparable> int lower_bound(List<T> list, T key){ 
		 int lower=-1;int upper=list.size(); 
		 while(upper - lower>1){ 
		 int center =(upper+lower)/2; 
		 if(list.get(center).compareTo(key)>=0)upper=center; 
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> int upper_bound(List<T> list, T key){ 
		 int lower=-1;int upper=list.size(); 
		 while(upper-lower >1){ 
		 int center=(upper+lower)/2; 
		 if(list.get(center).compareTo(key)>0)upper=center; 
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> boolean next_permutation(List<T> list){ 
		 int lastIndex = list.size()-2; 
		 while(lastIndex>=0 && list.get(lastIndex).compareTo(list.get(lastIndex+1))>=0)--lastIndex; 
		 if(lastIndex<0)return false; 
		 int swapIndex = list.size()-1; 
		 while(list.get(lastIndex).compareTo(list.get(swapIndex))>=0)swapIndex--; 
		 T tmp = list.get(lastIndex); 
		 list.set(lastIndex++, list.get(swapIndex)); 
		 list.set(swapIndex, tmp); 
		 swapIndex = list.size()-1; 
		 while(lastIndex<swapIndex){ 
		 tmp = list.get(lastIndex); 
		 list.set(lastIndex, list.get(swapIndex)); 
		 list.set(swapIndex, tmp); 
		 ++lastIndex;--swapIndex; 
		 } 
		 return true; 
	 } 
	 private static final byte[] buffer = new byte[1<<15]; 
	 private static int ptr = 0; 
	 private static int buflen = 0; 
	 private static boolean hasNextByte(){ 
		 if(ptr<buflen)return true; 
		 ptr = 0; 
		 try{ 
			 buflen = in.read(buffer); 
		 } catch (IOException e){ 
			 e.printStackTrace(); 
		 } 
		 return buflen>0; 
	 } 
	 private static int readByte(){ if(hasNextByte()) return buffer[ptr++]; else return -1;} 
	 private static boolean isSpaceChar(int c){ return!(33<=c && c<=126);} 
	 private static int skip(){int res; while((res=readByte())!=-1 && isSpaceChar(res)); return res;} 
 
	 private static double nd(){ return Double.parseDouble(ns()); } 
	 private static char nc(){ return (char)skip(); } 
	 private static String ns(){ 
		 StringBuilder sb = new StringBuilder(); 
		 for(int b=skip();!isSpaceChar(b);b=readByte())sb.append((char)b); 
		 return sb.toString(); 
	 } 
	 private static int[] nia(int n){ 
		 int[] res = new int[n]; 
		 for(int i=0;i<n;++i)res[i]=ni(); 
		 return res; 
	 } 
	 private static long[] nla(int n){ 
		 long[] res = new long[n]; 
		 for(int i=0;i<n;++i)res[i]=nl(); 
		 return res; 
	 } 
	 private static int ni(){ 
		 int res=0,b; 
		 boolean minus=false; 
		 while((b=readByte())!=-1 &&!((b>='0'&&b<='9') || b=='-')); 
		 if(b=='-'){ 
			 minus=true; 
			 b=readByte(); 
		 } 
		 for(;'0'<=b&&b<='9';b=readByte())res=res*10+(b-'0'); 
		 return minus? -res:res; 
	 } 
	 private static long nl(){ 
		 long res=0,b; 
		 boolean minus=false; 
		 while((b=readByte())!=-1 &&!((b>='0'&&b<='9') || b=='-')); 
		 if(b=='-'){ 
			 minus=true; 
			 b=readByte(); 
		 } 
		 for(;'0'<=b&&b<='9';b=readByte())res=res*10+(b-'0'); 
		 return minus? -res:res; 
	} 
} 


```

### Response:
```python
import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter; 
import java.util.*; 
 
class p03892: 
    def gcd(self, a, b):
        if(b==0):
            return a
        return self.gcd(b, a%b)

    def solve(self): 
        a = self.ni()
        b = self.ni()
        a = abs(self.ni()-a)
        b = abs(self.ni()-b)
        g = self.gcd(a, b)
        ans = a//g + b//g -1
        self.out.println(ans*g)

    def __init__(self): 
        self.in = System.in
        self.out = PrintWriter(System.out)

    def ni(self):
        res=0
        b=self.readByte()
        while(b!='-' and (b<'0' or b>'9')):
            b=self.readByte()
        if(b=='-'):
            minus=True
            b=self.readByte()
        else:
            minus=False
        for i in range(0,10):
            if(b=='0'+str(i)):
                res=res*10+i
        if(minus):
            res=-res
        return res

    def nl(self):
        res=0
        b=self.readByte()
        while(b!='-' and (b<'0' or b>'9')):
            b=self.readByte()
        if(b=='-'):
            minus=True
            b=self.readByte()
        else:
            minus=False
        for i in range(0,10):
            if(b=='0'+str(i)):
                res=res*10+i
        if(minus):
            res=-res
        return res

    def readByte(self):
        if(self.ptr<self.buflen):
            return self.buffer[self.ptr]
        self.ptr=0
        try:
            self.buflen = self.in.read(self.buffer)
        except IOException as e:
            e.printStackTrace()
        if(self.buflen>0):
            return self.buffer[self.ptr]
        else:
            return -1

    def isSpaceChar(self, c):
        return not(33<=c and c<=126)

    def skip(self):
        res=self.readByte()
        while(res!=-1 and self.isSpaceChar(res)):
            res=self.readByte()
        return res

    def __del__(self):
        self.out.flush()

p03892().solve()
```<|endoftext|>
