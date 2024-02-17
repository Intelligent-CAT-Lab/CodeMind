import java.util.*;

public class Main{

	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
      
      	String input=sc.next();
      
      	String[] valueset=input.split("");
      
      	if(valueset[1].equals(valueset[2]) && (valueset[0].equals(valueset[1]) || valueset[1].equals(valueset[3]))){
        	System.out.println("Yes");
        }else{
          	System.out.println("No");
        }
    }	
  
}