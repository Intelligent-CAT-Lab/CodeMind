import java.util.Scanner;
 
 
public class Main{
     
    public static void main(String[] args){
    	
    	final Scanner sc = new Scanner(System.in);
    	
    	long n = sc.nextLong();
System.out.println("[INST]9;n;sc.nextLong();"+n);
    	int count = 0;
    	
    	while(n > 1){
    		n  = (n + (n % 3 == 0 ? 0 : 3 - n % 3)) / 3;
    		count++;
    	}
    	
    	System.out.println(count);
    	
    }
     
}