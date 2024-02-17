import java.io.IOException; 
import java.io.InputStream; 
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List; 

class Main{ 
	static class Edge{
		int to, cost;
		Edge(int t, int c){to=t;cost=c;}
	}

	static void solve(){
		int l = ni();
		List<Edge> edges[] = new List[21];
		for(int i=0;i<=20;++i)edges[i]=new ArrayList<>();
		for(int i=1;i<20;++i)edges[i].add(new Edge((i+1), 0));
		int[] ika = new int[21];
		for(int i=20;i>=1;--i)ika[i]=(1<<(20-i))-1;
		for(int i=19;i>=1;--i){
			if((1<<(19-i)) + ika[i+1]<l){
				edges[i].add(new Edge((i+1), (1<<(19-i))));
			}else{
				int v = i+1;
				int max = ika[v];
				for(int j=v+1;j<=20;++j){
					if(max+1 + ika[j]<l){
						edges[v].add(new Edge(j, (max+1)));
						max = max+1+ika[j];
					}
				}
				break;
			}
			if(i==1){
				int v = i;
				int max = ika[v];
				for(int j=v+1;j<=20;++j){
					if(max+1 + ika[j]<l){
						edges[v].add(new Edge(j, (max+1)));
						max = max+1+ika[j];
					}
				}
				break;
			}
		}
		int num = 0;
		for(int i=1;i<=20;++i)num+=edges[i].size();
		out.println(20+" "+num);
		for(int i=1;i<=20;++i){
			for(Edge e: edges[i])out.println(i+" "+e.to+" "+e.cost);
		}

 
	} 
 
 
 
 
	public static void main(String[] args){ 
		 solve(); 
		 out.flush(); 
	 } 
	 private static InputStream in = System.in; 
	 private static PrintWriter out = new PrintWriter(System.out); 
 
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

