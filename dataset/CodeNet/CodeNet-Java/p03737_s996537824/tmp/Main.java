//import java.util.Arrays;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	String s1 = sc.next();
System.out.println("[INST]9;s1;sc.next();"+s1);
    	String s2 = sc.next();
System.out.println("[INST]10;s2;sc.next();"+s2);
    	String s3 = sc.next();
System.out.println("[INST]11;s3;sc.next();"+s3);
    	System.out.println(s1.substring(0,1).toUpperCase()+s2.substring(0,1).toUpperCase()+s3.substring(0,1).toUpperCase());
    }
}