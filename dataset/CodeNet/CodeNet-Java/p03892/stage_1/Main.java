import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter; 
import java.util.*; 
 

class Main{ 
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
var newVariable_0 = list.get(center).compareTo(key);var newVariable_1 = list.get(center);		 if(newVariable_1.compareTo(key)>=0)upper=center; 
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> int upper_bound(List<T> list, T key){ 
		 int lower=-1;int upper=list.size(); 
		 while(upper-lower >1){ 
		 int center=(upper+lower)/2; 
var newVariable_2 = list.get(center).compareTo(key);var newVariable_3 = list.get(center);		 if(newVariable_3.compareTo(key)>0)upper=center; 
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> boolean next_permutation(List<T> list){ 
var newVariable_4 = list.size();		 int lastIndex = newVariable_4-2; 
var newVariable_5 = list.get(lastIndex).compareTo(list.get(lastIndex+1));var newVariable_6 = list.get(lastIndex);var newVariable_7 = list.get(lastIndex+1);		 while(lastIndex>=0 && list.get(lastIndex).compareTo(newVariable_7)>=0)--lastIndex; 
		 if(lastIndex<0)return false; 
var newVariable_8 = list.size();		 int swapIndex = newVariable_8-1; 
var newVariable_9 = list.get(lastIndex).compareTo(list.get(swapIndex));var newVariable_10 = list.get(lastIndex);var newVariable_11 = list.get(swapIndex);		 while(list.get(lastIndex).compareTo(newVariable_11)>=0)swapIndex--; 
		 T tmp = list.get(lastIndex); 
var newVariable_12 = list.set(lastIndex++, list.get(swapIndex));var newVariable_13 = list.get(swapIndex);		 list.set(lastIndex++, newVariable_13); 
var newVariable_14 = list.set(swapIndex, tmp);var newVariable_15 = list.size();		 swapIndex = newVariable_15-1; 
		 while(lastIndex<swapIndex){ 
		 tmp = list.get(lastIndex); 
var newVariable_16 = list.set(lastIndex, list.get(swapIndex));var newVariable_17 = list.get(swapIndex);		 list.set(lastIndex, newVariable_17); 
var newVariable_18 = list.set(swapIndex, tmp);		 ++lastIndex;--swapIndex; 
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
	 private static boolean isSpaceChar(int c){ return !(33<=c && c<=126);} 
	 private static int skip(){int res; while((res=readByte())!=-1 && isSpaceChar(res)); return res;} 
 
	 private static double nd(){ return Double.parseDouble(ns()); } 
	 private static char nc(){ return (char)skip(); } 
	 private static String ns(){ 
		 StringBuilder sb = new StringBuilder(); 
		 for(int b=skip();!isSpaceChar(b);b=readByte())sb.append((char)b); 
var newVariable_19 = sb.toString();		 return newVariable_19; 
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
		 while((b=readByte())!=-1 && !((b>='0'&&b<='9') || b=='-')); 
		 if(b=='-'){ 
			 minus=true; 
			 b=readByte(); 
		 } 
		 for(;'0'<=b&&b<='9';b=readByte())res=res*10+(b-'0'); 
		 return minus ? -res:res; 
	 } 
	 private static long nl(){ 
		 long res=0,b; 
		 boolean minus=false; 
		 while((b=readByte())!=-1 && !((b>='0'&&b<='9') || b=='-')); 
		 if(b=='-'){ 
			 minus=true; 
			 b=readByte(); 
		 } 
		 for(;'0'<=b&&b<='9';b=readByte())res=res*10+(b-'0'); 
		 return minus ? -res:res; 
	} 
} 

