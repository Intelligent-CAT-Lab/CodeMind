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
System.out.println("[INST]26;None;out.flush();"+out.flush());
	 } 
	 private static InputStream in = System.in; 
	 private static PrintWriter out = new PrintWriter(System.out); 
 
	 static boolean inrange(int y, int x, int h, int w){ 
		 return y>=0 && y<h && x>=0 && x<w; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static<T extends Comparable> int lower_bound(List<T> list, T key){ 
		 int lower=-1;int upper=list.size(); 
System.out.println("[INST]36;upper;list.size();"+upper);
		 while(upper - lower>1){ 
		 int center =(upper+lower)/2; 
		 if(list.get(center).compareTo(key)>=0)upper=center; 
System.out.println("[INST]39;None;list.get(center).compareTo(key);"+list.get(center).compareTo(key));
System.out.println("[INST]39;None;list.get(center);"+list.get(center));
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> int upper_bound(List<T> list, T key){ 
		 int lower=-1;int upper=list.size(); 
System.out.println("[INST]46;upper;list.size();"+upper);
		 while(upper-lower >1){ 
		 int center=(upper+lower)/2; 
		 if(list.get(center).compareTo(key)>0)upper=center; 
System.out.println("[INST]49;None;list.get(center).compareTo(key);"+list.get(center).compareTo(key));
System.out.println("[INST]49;None;list.get(center);"+list.get(center));
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> boolean next_permutation(List<T> list){ 
		 int lastIndex = list.size()-2; 
System.out.println("[INST]56;None;list.size();"+list.size());
		 while(lastIndex>=0 && list.get(lastIndex).compareTo(list.get(lastIndex+1))>=0)--lastIndex; 
System.out.println("[INST]57;None;list.get(lastIndex).compareTo(list.get(lastIndex+1));"+list.get(lastIndex).compareTo(list.get(lastIndex+1)));
System.out.println("[INST]57;None;list.get(lastIndex);"+list.get(lastIndex));
System.out.println("[INST]57;None;list.get(lastIndex+1);"+list.get(lastIndex+1));
		 if(lastIndex<0)return false; 
		 int swapIndex = list.size()-1; 
System.out.println("[INST]59;None;list.size();"+list.size());
		 while(list.get(lastIndex).compareTo(list.get(swapIndex))>=0)swapIndex--; 
System.out.println("[INST]60;None;list.get(lastIndex).compareTo(list.get(swapIndex));"+list.get(lastIndex).compareTo(list.get(swapIndex)));
System.out.println("[INST]60;None;list.get(lastIndex);"+list.get(lastIndex));
System.out.println("[INST]60;None;list.get(swapIndex);"+list.get(swapIndex));
		 T tmp = list.get(lastIndex); 
System.out.println("[INST]61;tmp;list.get(lastIndex);"+tmp);
		 list.set(lastIndex++, list.get(swapIndex)); 
System.out.println("[INST]62;None;list.set(lastIndex++, list.get(swapIndex));"+list.set(lastIndex++, list.get(swapIndex)));
System.out.println("[INST]62;None;list.get(swapIndex);"+list.get(swapIndex));
		 list.set(swapIndex, tmp); 
System.out.println("[INST]63;None;list.set(swapIndex, tmp);"+list.set(swapIndex, tmp));
		 swapIndex = list.size()-1; 
System.out.println("[INST]64;None;list.size();"+list.size());
		 while(lastIndex<swapIndex){ 
		 tmp = list.get(lastIndex); 
System.out.println("[INST]66;tmp;list.get(lastIndex);"+tmp);
		 list.set(lastIndex, list.get(swapIndex)); 
System.out.println("[INST]67;None;list.set(lastIndex, list.get(swapIndex));"+list.set(lastIndex, list.get(swapIndex)));
System.out.println("[INST]67;None;list.get(swapIndex);"+list.get(swapIndex));
		 list.set(swapIndex, tmp); 
System.out.println("[INST]68;None;list.set(swapIndex, tmp);"+list.set(swapIndex, tmp));
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
System.out.println("[INST]80;buflen;in.read(buffer);"+buflen);
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
		 return sb.toString(); 
System.out.println("[INST]95;None;sb.toString();"+sb.toString());
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

