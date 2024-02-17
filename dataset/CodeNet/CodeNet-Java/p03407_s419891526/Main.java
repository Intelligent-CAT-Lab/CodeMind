import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        String cnt;
        
        if( a + b >= c )cnt = "Yes";
        else 
          cnt = "No";
            
        System.out.println(cnt);
        
      }
}