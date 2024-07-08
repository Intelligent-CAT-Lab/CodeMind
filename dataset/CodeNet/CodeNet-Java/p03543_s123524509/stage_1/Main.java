import java.util.*;

public class Main{

	public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
      
      	String input=sc.next();
      
      	String[] valueset=input.split("");
      
var newVariable_0 = valueset[1].equals(valueset[2]);var newVariable_1 = valueset[0].equals(valueset[1]);var newVariable_2 = valueset[1].equals(valueset[3]);      	if(valueset[1].equals(valueset[2]) && (valueset[0].equals(valueset[1]) || newVariable_2)){
        	System.out.println("Yes");
        }else{
          	System.out.println("No");
        }
    }	
  
}