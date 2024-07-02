import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	//入力文字列
	String s;
	s = scan.next();
System.out.println("[INST]9;s;scan.next();"+s);

	StringBuffer sb = new StringBuffer(s);

	if(s.length() == 2){
System.out.println("[INST]13;None;s.length();"+s.length());
	    System.out.println(s);
	}else{
	    //反転用文字列
	    String dst = sb.reverse().toString();
System.out.println("[INST]17;dst;sb.reverse().toString();"+dst);
System.out.println("[INST]17;None;sb.reverse();"+sb.reverse());
	    System.out.println(dst);
	}
    }
}
	
