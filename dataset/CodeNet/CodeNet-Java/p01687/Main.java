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
		String tt = "";
		while(scan.hasNext()){
			String dstr = scan.next();
			if(dstr.length() < 8){
				System.out.println(dstr);
				continue;
			}
			for(int i = 0;i < dstr.length()-7;i++){
				t = dstr.substring(i,i+8).toCharArray();
				tt = String.valueOf(t);
				sort(t);
				if(mstr.equals(String.valueOf(t))){
					dstr = dstr.replace(tt,nstr);
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