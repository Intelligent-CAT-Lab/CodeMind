import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter; 
import java.util.*; 
 

class Main{ 

	static void solve(){ 
		int n=ni();
		List<Integer> pos = new ArrayList<>();
		for(int i=0;i<n;i+=6){
			for(int j=1;j<n;j+=2)pos.add(i*n + j);
System.out.println("[INST]12;None;pos.add(i*n + j);"+pos.add(i*n + j));
		}
		for(int i=3;i<n;i+=6){
			for(int j=0;j<n;j+=2)pos.add(i*n + j);
System.out.println("[INST]15;None;pos.add(i*n + j);"+pos.add(i*n + j));
		}
		for(int i=1;i<n;i+=6)pos.add(i*n);
System.out.println("[INST]17;None;pos.add(i*n);"+pos.add(i*n));
		for(int i=5;i<n;i+=6)pos.add(i*n);
System.out.println("[INST]18;None;pos.add(i*n);"+pos.add(i*n));
		if((n-1)%6==2){
			for(int j=1;j<n;j+=2)pos.add((n-1)*n + j);
System.out.println("[INST]20;None;pos.add((n-1)*n + j);"+pos.add((n-1)*n + j));
		}
		if((n-1)%6==5){
			for(int j=2;j<n;j+=2)pos.add((n-1)*n + j);
System.out.println("[INST]23;None;pos.add((n-1)*n + j);"+pos.add((n-1)*n + j));
		}
		Set<Integer> used = new HashSet<>();

		out.println(pos.size());
		for(int t: pos){
			int i = t/n, j = t%n;
			out.println(j+" "+i);
			if(!used.add(t)){
System.out.println("[INST]31;None;used.add(t);"+used.add(t));
				out.println("NyaN");return;
			}
		}
	} 
 
 
 
 
	 public static void main(String[] args){ 
		 solve(); 
		 out.flush(); 
System.out.println("[INST]42;None;out.flush();"+out.flush());
	 } 
	 private static InputStream in = System.in; 
	 private static PrintWriter out = new PrintWriter(System.out); 
 
	 static boolean inrange(int y, int x, int h, int w){ 
		 return y>=0 && y<h && x>=0 && x<w; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static<T extends Comparable> int lower_bound(List<T> list, T key){ 
		 int lower=-1;int upper=list.size(); 
System.out.println("[INST]52;upper;list.size();"+upper);
		 while(upper - lower>1){ 
		 int center =(upper+lower)/2; 
		 if(list.get(center).compareTo(key)>=0)upper=center; 
System.out.println("[INST]55;None;list.get(center).compareTo(key);"+list.get(center).compareTo(key));
System.out.println("[INST]55;None;list.get(center);"+list.get(center));
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> int upper_bound(List<T> list, T key){ 
		 int lower=-1;int upper=list.size(); 
System.out.println("[INST]62;upper;list.size();"+upper);
		 while(upper-lower >1){ 
		 int center=(upper+lower)/2; 
		 if(list.get(center).compareTo(key)>0)upper=center; 
System.out.println("[INST]65;None;list.get(center).compareTo(key);"+list.get(center).compareTo(key));
System.out.println("[INST]65;None;list.get(center);"+list.get(center));
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> boolean next_permutation(List<T> list){ 
		 int lastIndex = list.size()-2; 
System.out.println("[INST]72;None;list.size();"+list.size());
		 while(lastIndex>=0 && list.get(lastIndex).compareTo(list.get(lastIndex+1))>=0)--lastIndex; 
System.out.println("[INST]73;None;list.get(lastIndex).compareTo(list.get(lastIndex+1));"+list.get(lastIndex).compareTo(list.get(lastIndex+1)));
System.out.println("[INST]73;None;list.get(lastIndex);"+list.get(lastIndex));
System.out.println("[INST]73;None;list.get(lastIndex+1);"+list.get(lastIndex+1));
		 if(lastIndex<0)return false; 
		 int swapIndex = list.size()-1; 
System.out.println("[INST]75;None;list.size();"+list.size());
		 while(list.get(lastIndex).compareTo(list.get(swapIndex))>=0)swapIndex--; 
System.out.println("[INST]76;None;list.get(lastIndex).compareTo(list.get(swapIndex));"+list.get(lastIndex).compareTo(list.get(swapIndex)));
System.out.println("[INST]76;None;list.get(lastIndex);"+list.get(lastIndex));
System.out.println("[INST]76;None;list.get(swapIndex);"+list.get(swapIndex));
		 T tmp = list.get(lastIndex); 
System.out.println("[INST]77;tmp;list.get(lastIndex);"+tmp);
		 list.set(lastIndex++, list.get(swapIndex)); 
System.out.println("[INST]78;None;list.set(lastIndex++, list.get(swapIndex));"+list.set(lastIndex++, list.get(swapIndex)));
System.out.println("[INST]78;None;list.get(swapIndex);"+list.get(swapIndex));
		 list.set(swapIndex, tmp); 
System.out.println("[INST]79;None;list.set(swapIndex, tmp);"+list.set(swapIndex, tmp));
		 swapIndex = list.size()-1; 
System.out.println("[INST]80;None;list.size();"+list.size());
		 while(lastIndex<swapIndex){ 
		 tmp = list.get(lastIndex); 
System.out.println("[INST]82;tmp;list.get(lastIndex);"+tmp);
		 list.set(lastIndex, list.get(swapIndex)); 
System.out.println("[INST]83;None;list.set(lastIndex, list.get(swapIndex));"+list.set(lastIndex, list.get(swapIndex)));
System.out.println("[INST]83;None;list.get(swapIndex);"+list.get(swapIndex));
		 list.set(swapIndex, tmp); 
System.out.println("[INST]84;None;list.set(swapIndex, tmp);"+list.set(swapIndex, tmp));
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
System.out.println("[INST]96;buflen;in.read(buffer);"+buflen);
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
System.out.println("[INST]111;None;sb.toString();"+sb.toString());
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

