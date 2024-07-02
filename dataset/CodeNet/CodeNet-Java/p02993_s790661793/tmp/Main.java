import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{	
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
System.out.println("[INST]7;s;sc.next();"+s);
	boolean flag = true;
	for(int i = 0; i < 3; i++){
	 	if(s.substring(i,i+1).equals(s.substring(i+1,i+2))){
System.out.println("[INST]10;None;s.substring(i,i+1).equals(s.substring(i+1,i+2));"+s.substring(i,i+1).equals(s.substring(i+1,i+2)));
System.out.println("[INST]10;None;s.substring(i,i+1);"+s.substring(i,i+1));
System.out.println("[INST]10;None;s.substring(i+1,i+2);"+s.substring(i+1,i+2));
	 		flag = false;
	 	}
	}
	if(flag){
		System.out.println("Good");
	}else{
		System.out.println("Bad");
	}
}
}
