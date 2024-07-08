import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0257().doIt();
	}
	
	class AOJ0257{
		
		String solve(String input){
var newVariable_0 = input.equals("1 1 0");var newVariable_1 = input.equals("0 0 1");			if(input.equals("1 1 0")||newVariable_1)return "Open";
			return "Close";
		}
		
		void doIt(){
var newVariable_2 = in.hasNext();			while(newVariable_2)System.out.println(solve(in.nextLine()));
		}
	}
	
}