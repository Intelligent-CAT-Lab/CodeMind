import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

  		int num = sc.nextInt(); 
      	int stack_item = num/100;
      	int diff = num - stack_item * 100;
      	boolean pos = false;
      
      	if(diff <= stack_item*5) pos = true;
      	
      	if(pos) System.out.println("1");
      	else System.out.println("0");
        
	}
}
