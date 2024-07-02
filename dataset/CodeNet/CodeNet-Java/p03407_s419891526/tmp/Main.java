import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int a = scan.nextInt();
System.out.println("[INST]6;a;scan.nextInt();"+a);
        int b = scan.nextInt();
System.out.println("[INST]7;b;scan.nextInt();"+b);
        int c = scan.nextInt();
System.out.println("[INST]8;c;scan.nextInt();"+c);
        
        String cnt;
        
        if( a + b >= c )cnt = "Yes";
        else 
          cnt = "No";
            
        System.out.println(cnt);
        
      }
}