import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
System.out.println("[INST]5;l;sc.nextInt();"+l);
		int k=l;
		int t=1;
		int count=1;
		ArrayList<String> ans=new ArrayList<>();
		while(l>1){
			if((l & 1)==1){
				k-=t;
				ans.add(count+" "+20+" "+k);
System.out.println("[INST]13;None;ans.add(count+' '+20+' '+k);"+ans.add(count+" "+20+" "+k));
			}
			ans.add(count+" "+(count+1)+" "+t);
System.out.println("[INST]15;None;ans.add(count+' '+(count+1)+' '+t);"+ans.add(count+" "+(count+1)+" "+t));
			count++;
			l>>=1;
			t*=2;
		}
		System.out.println(20+" "+(ans.size()+19));
		for(int i=0; i<19; i++){
			System.out.println((i+1)+" "+(i+2)+" "+0);
		}
		for(String s:ans){
			System.out.println(s);
		}
	}
}
