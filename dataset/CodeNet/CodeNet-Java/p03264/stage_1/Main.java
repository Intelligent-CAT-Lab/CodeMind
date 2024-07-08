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
var newVariable_0 = System.out.printf("%d ",data[i]);		}
			System.out.println();
	}
	
	static void disp(String[] data){
		for(int i=0; i<data.length; i++){
var newVariable_1 = System.out.printf("%s ",data[i]);		}
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
			return i;
		}
		long readLong(){
var newVariable_2 = sc.nextLine();			long i=Long.parseLong(newVariable_2);
			return i;
		}
		int[] readIntL(){
var newVariable_3 = sc.nextLine();			String[] buf=newVariable_3.split(" ");
			int[] num=new int[buf.length];
			for(int i=0; i<buf.length; i++){
var newVariable_4 = Integer.parseInt(buf[i]);				num[i]=newVariable_4;
			}
			return num;
		}
		
		String readString(){
var newVariable_5 = sc.nextLine();			return newVariable_5;
		}
		String[] readStringL(String dlm){
var newVariable_6 = sc.nextLine();			String[] s=newVariable_6.split(dlm);
			return s;
		}
	}
}
