import java.util.*;
public class Main{
	public static void main(String[] args){
		new Main().run();
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		String mstr = "AADINNUY";
		String nstr = "AIZUNYAN";
		char[] t = "AAAAAAAA".toCharArray();
System.out.println("[INST]9;t;'AAAAAAAA'.toCharArray();"+t);
		String tt = "";
		while(scan.hasNext()){
System.out.println("[INST]11;None;scan.hasNext();"+scan.hasNext());
			String dstr = scan.next();
System.out.println("[INST]12;dstr;scan.next();"+dstr);
			if(dstr.length() < 8){
System.out.println("[INST]13;None;dstr.length();"+dstr.length());
				System.out.println(dstr);
				continue;
			}
			for(int i = 0;i < dstr.length()-7;i++){
System.out.println("[INST]17;None;dstr.length();"+dstr.length());
				t = dstr.substring(i,i+8).toCharArray();
System.out.println("[INST]18;t;dstr.substring(i,i+8).toCharArray();"+t);
System.out.println("[INST]18;None;dstr.substring(i,i+8);"+dstr.substring(i,i+8));
				tt = String.valueOf(t);
System.out.println("[INST]19;tt;String.valueOf(t);"+tt);
				sort(t);
				if(mstr.equals(String.valueOf(t))){
System.out.println("[INST]21;None;mstr.equals(String.valueOf(t));"+mstr.equals(String.valueOf(t)));
System.out.println("[INST]21;None;String.valueOf(t);"+String.valueOf(t));
					dstr = dstr.replace(tt,nstr);
System.out.println("[INST]22;dstr;dstr.replace(tt,nstr);"+dstr);
					i += 7;
				}
			}
			System.out.println(dstr);	
		}
	}
	public char[] sort(char[] t){
		for(int i = 0;i < t.length;i++){
			for(int j = t.length-1;j > i;j--){
				if(t[i] > t[j]){
					char a = t[i];
					t[i] = t[j];
					t[j] = a;				
				}
			}
		}
		return t;
	}
}