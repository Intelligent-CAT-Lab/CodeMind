import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class Main{public static void main(String[] args){new Solver();}}

class Solver{
	ScanReader reader=new ScanReader(System.in);
	PrintWriter writer=new PrintWriter(System.out);
	Solver(){main(); writer.flush();}
System.out.println("[INST]10;None;writer.flush();"+writer.flush());
	
	void main(){
		BigInteger m=BigInteger.ONE;
		for(int i=0;i<1500;i++)
			m=m.multiply(BigInteger.valueOf(i+2));
System.out.println("[INST]15;m;m.multiply(BigInteger.valueOf(i+2));"+m);
System.out.println("[INST]15;None;BigInteger.valueOf(i+2);"+BigInteger.valueOf(i+2));
		m=m.add(BigInteger.valueOf(2));
System.out.println("[INST]16;m;m.add(BigInteger.valueOf(2));"+m);
System.out.println("[INST]16;None;BigInteger.valueOf(2);"+BigInteger.valueOf(2));
		
		while(reader.hasNext()){
			int n=Integer.parseInt(reader.next());
			System.out.println(m);
			for(int i=0;i<n;i++)
				System.out.println(i+2);
		}
	}
}

class ScanReader{
	BufferedReader br;
	StringTokenizer st;
	public ScanReader(InputStream in){
		br=new BufferedReader(new InputStreamReader(in));
		st=null;
	}
	public boolean hasNext(){
		while(st==null || !st.hasMoreTokens()){
System.out.println("[INST]35;None;st.hasMoreTokens();"+st.hasMoreTokens());
			try{
				if(!br.ready())
System.out.println("[INST]37;None;br.ready();"+br.ready());
					return false;
				st=new StringTokenizer(br.readLine());
System.out.println("[INST]39;None;br.readLine();"+br.readLine());
			}
			catch(IOException e){
				throw new RuntimeException(e);
			}
		}
		return true;
	}
	public String nextLine(){
		hasNext();
		return st.nextToken("");
System.out.println("[INST]49;None;st.nextToken('');"+st.nextToken(""));
	}
	public String next(){
		hasNext();
		return st.nextToken();
System.out.println("[INST]53;None;st.nextToken();"+st.nextToken());
	}
}