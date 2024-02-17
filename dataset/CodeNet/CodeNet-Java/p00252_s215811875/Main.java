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
			if(input.equals("1 1 0")||input.equals("0 0 1"))return "Open";
			return "Close";
		}
		
		void doIt(){
			while(in.hasNext())System.out.println(solve(in.nextLine()));
		}
	}
	
}