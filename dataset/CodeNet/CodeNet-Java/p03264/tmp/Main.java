import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		FScanner sc=new FScanner();
		//Scanner sc=new Scanner(System.in);
		
		int n=sc.readInt();
		
		
		int o=0;
		int e=0;
		
		for(int i=1; i<=n; i++){
			
			if(i%2==1){
				o+=1;
			}else{
				e+=1;
			}
		}
		System.out.println(o*e);
	}
	
	static void solve(){}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
System.out.println("[INST]30;None;System.out.printf('%d ',data[i]);"+System.out.printf("%d ",data[i]));
		}
			System.out.println();
	}
	
	static void disp(String[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%s ",data[i]);
System.out.println("[INST]37;None;System.out.printf('%s ',data[i]);"+System.out.printf("%s ",data[i]));
		}
			System.out.println();
	}
	
	static class FScanner{
		Scanner sc;
		FScanner() throws FileNotFoundException{
			sc=new Scanner(System.in);
		}
		boolean hasNextLine(){
			boolean has=true;
			if(!sc.hasNextLine()){
				has=false;
			}
			return has;
		}
		int readInt(){
			int i=sc.nextInt();
System.out.println("[INST]55;i;sc.nextInt();"+i);
			return i;
		}
		long readLong(){
			long i=Long.parseLong(sc.nextLine());
System.out.println("[INST]59;i;Long.parseLong(sc.nextLine());"+i);
System.out.println("[INST]59;None;sc.nextLine();"+sc.nextLine());
			return i;
		}
		int[] readIntL(){
			String[] buf=sc.nextLine().split(" ");
System.out.println("[INST]63;buf;sc.nextLine().split(' ');"+buf);
System.out.println("[INST]63;None;sc.nextLine();"+sc.nextLine());
			int[] num=new int[buf.length];
			for(int i=0; i<buf.length; i++){
				num[i]=Integer.parseInt(buf[i]);
System.out.println("[INST]66;None;Integer.parseInt(buf[i]);"+Integer.parseInt(buf[i]));
			}
			return num;
		}
		
		String readString(){
			return sc.nextLine();
System.out.println("[INST]72;None;sc.nextLine();"+sc.nextLine());
		}
		String[] readStringL(String dlm){
			String[] s=sc.nextLine().split(dlm);
System.out.println("[INST]75;s;sc.nextLine().split(dlm);"+s);
System.out.println("[INST]75;None;sc.nextLine();"+sc.nextLine());
			return s;
		}
	}
}
