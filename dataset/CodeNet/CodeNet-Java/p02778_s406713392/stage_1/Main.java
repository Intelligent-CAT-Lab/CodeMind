import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Length=S.length();
      	char tmp[];
      	tmp =new char[Length];
      	for(int i=0 ;i<Length;i++)
        {
          	tmp[i]='x';
        }
      	System.out.println(tmp);
	}
}