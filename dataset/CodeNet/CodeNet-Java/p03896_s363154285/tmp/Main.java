import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter; 
import java.util.*; 
 

class Main{ 

	static void solve(){
		int n=ni();
		int[][] A = new int[n][n-1];
		if(n==2){
			out.println(-1);return;
		}
		if(n%2==1){
			for(int i=0;i<n;++i){
				for(int j=1;j<=n-1;++j)A[i][j-1]=(i+j)%n;
			}
		}else{
			for(int i=0;i<n;++i)A[i][0]=(i+1)%n;
			for(int i=0;i<n-1;++i){
				for(int j=2;j<=n-2;++j)A[i][j-1] = (i+j)%(n-1);
			}
			for(int j=1;j<n-1;++j)A[n-1][j]=j;
			for(int i=0;i<n-2;++i)A[i][n-2]=n-1;
		}
		for(int i=0;i<n;++i){
			for(int j=0;j<n-1;++j)out.print((A[i][j]+1)+" ");
			out.println();
		}
 
	} 
 
 
 
 
	 public static void main(String[] args){ 
		 solve(); 
		 out.flush(); 
System.out.println("[INST]38;None;out.flush();"+out.flush());
	 } 
	 private static InputStream in = System.in; 
	 private static PrintWriter out = new PrintWriter(System.out); 
 
	 static boolean inrange(int y, int x, int h, int w){ 
		 return y>=0 && y<h && x>=0 && x<w; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static<T extends Comparable> int lower_bound(List<T> list, T key){ 
		 int lower=-1;int upper=list.size(); 
System.out.println("[INST]48;upper;list.size();"+upper);
		 while(upper - lower>1){ 
		 int center =(upper+lower)/2; 
		 if(list.get(center).compareTo(key)>=0)upper=center; 
System.out.println("[INST]51;None;list.get(center).compareTo(key);"+list.get(center).compareTo(key));
System.out.println("[INST]51;None;list.get(center);"+list.get(center));
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> int upper_bound(List<T> list, T key){ 
		 int lower=-1;int upper=list.size(); 
System.out.println("[INST]58;upper;list.size();"+upper);
		 while(upper-lower >1){ 
		 int center=(upper+lower)/2; 
		 if(list.get(center).compareTo(key)>0)upper=center; 
System.out.println("[INST]61;None;list.get(center).compareTo(key);"+list.get(center).compareTo(key));
System.out.println("[INST]61;None;list.get(center);"+list.get(center));
		 else lower=center; 
		 } 
		 return upper; 
	 } 
	 @SuppressWarnings("unchecked") 
	 static <T extends Comparable> boolean next_permutation(List<T> list){ 
		 int lastIndex = list.size()-2; 
System.out.println("[INST]68;None;list.size();"+list.size());
		 while(lastIndex>=0 && list.get(lastIndex).compareTo(list.get(lastIndex+1))>=0)--lastIndex; 
System.out.println("[INST]69;None;list.get(lastIndex).compareTo(list.get(lastIndex+1));"+list.get(lastIndex).compareTo(list.get(lastIndex+1)));
System.out.println("[INST]69;None;list.get(lastIndex);"+list.get(lastIndex));
System.out.println("[INST]69;None;list.get(lastIndex+1);"+list.get(lastIndex+1));
		 if(lastIndex<0)return false; 
		 int swapIndex = list.size()-1; 
System.out.println("[INST]71;None;list.size();"+list.size());
		 while(list.get(lastIndex).compareTo(list.get(swapIndex))>=0)swapIndex--; 
System.out.println("[INST]72;None;list.get(lastIndex).compareTo(list.get(swapIndex));"+list.get(lastIndex).compareTo(list.get(swapIndex)));
System.out.println("[INST]72;None;list.get(lastIndex);"+list.get(lastIndex));
System.out.println("[INST]72;None;list.get(swapIndex);"+list.get(swapIndex));
		 T tmp = list.get(lastIndex); 
System.out.println("[INST]73;tmp;list.get(lastIndex);"+tmp);
		 list.set(lastIndex++, list.get(swapIndex)); 
System.out.println("[INST]74;None;list.set(lastIndex++, list.get(swapIndex));"+list.set(lastIndex++, list.get(swapIndex)));
System.out.println("[INST]74;None;list.get(swapIndex);"+list.get(swapIndex));
		 list.set(swapIndex, tmp); 
System.out.println("[INST]75;None;list.set(swapIndex, tmp);"+list.set(swapIndex, tmp));
		 swapIndex = list.size()-1; 
System.out.println("[INST]76;None;list.size();"+list.size());
		 while(lastIndex<swapIndex){ 
		 tmp = list.get(lastIndex); 
System.out.println("[INST]78;tmp;list.get(lastIndex);"+tmp);
		 list.set(lastIndex, list.get(swapIndex)); 
System.out.println("[INST]79;None;list.set(lastIndex, list.get(swapIndex));"+list.set(lastIndex, list.get(swapIndex)));
System.out.println("[INST]79;None;list.get(swapIndex);"+list.get(swapIndex));
		 list.set(swapIndex, tmp); 
System.out.println("[INST]80;None;list.set(swapIndex, tmp);"+list.set(swapIndex, tmp));
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
System.out.println("[INST]92;buflen;in.read(buffer);"+buflen);
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
System.out.println("[INST]107;None;sb.toString();"+sb.toString());
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

