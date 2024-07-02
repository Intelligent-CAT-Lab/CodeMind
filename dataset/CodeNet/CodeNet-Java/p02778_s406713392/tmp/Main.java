import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
System.out.println("[INST]4;S;sc.next();"+S);
		int Length=S.length();
System.out.println("[INST]5;Length;S.length();"+Length);
      	char tmp[];
      	tmp =new char[Length];
      	for(int i=0 ;i<Length;i++)
        {
          	tmp[i]='x';
        }
      	System.out.println(tmp);
	}
}