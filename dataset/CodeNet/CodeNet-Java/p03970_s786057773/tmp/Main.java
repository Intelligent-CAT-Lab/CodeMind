import java.util.*;
public class Main {
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	String s = scan.next();
System.out.println("[INST]4;s;scan.next();"+s);
	String m ="CODEFESTIVAL2016";
	int k = 0;
	for(int i=0;i<16;i++){
	    if(s.charAt(i)!=m.charAt(i))
System.out.println("[INST]8;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]8;None;m.charAt(i);"+m.charAt(i));
		k++;
		//String.valueOf(s.charAt(i));
	}
	System.out.println(k);
    }
}