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
var newVariable_0 = scan.hasNext();		while(newVariable_0){
			String dstr = scan.next();
var newVariable_1 = dstr.length();			if(newVariable_1 < 8){
				System.out.println(dstr);
				continue;
			}
var newVariable_2 = dstr.length();			for(int i = 0;i < newVariable_2-7;i++){
var newVariable_3 = dstr.substring(i,i+8);				t = newVariable_3.toCharArray();
				tt = String.valueOf(t);
				sort(t);
var newVariable_4 = mstr.equals(String.valueOf(t));var newVariable_5 = String.valueOf(t);				if(mstr.equals(newVariable_5)){
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