import java.util.*;

public class Main{

	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
      
      	String input=sc.next();
System.out.println("[INST]7;input;sc.next();"+input);
      
      	String[] valueset=input.split("");
System.out.println("[INST]9;valueset;input.split('');"+valueset);
      
      	if(valueset[1].equals(valueset[2]) && (valueset[0].equals(valueset[1]) || valueset[1].equals(valueset[3]))){
System.out.println("[INST]11;None;valueset[1].equals(valueset[2]);"+valueset[1].equals(valueset[2]));
System.out.println("[INST]11;None;valueset[0].equals(valueset[1]);"+valueset[0].equals(valueset[1]));
System.out.println("[INST]11;None;valueset[1].equals(valueset[3]);"+valueset[1].equals(valueset[3]));
        	System.out.println("Yes");
        }else{
          	System.out.println("No");
        }
    }	
  
}