import java.io.*;
import java.lang.*;
import java.math.*;
import java.util.*;

class Main{public static void main(String[] args){new Solver();}}

class Solver{
	ScanReader reader=new ScanReader(System.in);
	PrintWriter writer=new PrintWriter(System.out);
var newVariable_0 = writer.flush();	Solver(){main(); newVariable_0;}
	
	void main(){
		BigInteger m=BigInteger.ONE;
		for(int i=0;i<1500;i++)
var newVariable_1 = BigInteger.valueOf(i+2);			m=m.multiply(newVariable_1);
var newVariable_2 = BigInteger.valueOf(2);		m=m.add(newVariable_2);
		
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
var newVariable_3 = st.hasMoreTokens();		while(st==null || !newVariable_3){
			try{
var newVariable_4 = br.ready();				if(!newVariable_4)
					return false;
var newVariable_5 = br.readLine();				st=new StringTokenizer(newVariable_5);
			}
			catch(IOException e){
				throw new RuntimeException(e);
			}
		}
		return true;
	}
	public String nextLine(){
		hasNext();
var newVariable_6 = st.nextToken("");		return newVariable_6;
	}
	public String next(){
		hasNext();
var newVariable_7 = st.nextToken();		return newVariable_7;
	}
}