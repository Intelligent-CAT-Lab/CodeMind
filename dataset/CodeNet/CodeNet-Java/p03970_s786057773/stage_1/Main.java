import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String s = scan.next();
	String m ="CODEFESTIVAL2016";
	int k = 0;
	for(int i=0;i<16;i++){
var newVariable_0 = s.charAt(i);var newVariable_1 = m.charAt(i);	    if(s.charAt(i)!=newVariable_1)
		k++;
		//String.valueOf(s.charAt(i));
	}
	System.out.println(k);
    }
}