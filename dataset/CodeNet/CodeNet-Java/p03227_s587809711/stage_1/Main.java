import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	//入力文字列
	String s;
	s = scan.next();

	StringBuffer sb = new StringBuffer(s);

var newVariable_0 = s.length();	if(newVariable_0 == 2){
	    System.out.println(s);
	}else{
	    //反転用文字列
var newVariable_1 = sb.reverse();	    String dst = newVariable_1.toString();
	    System.out.println(dst);
	}
    }
}
	
