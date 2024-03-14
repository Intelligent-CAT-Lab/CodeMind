import java.util.Scanner;
import java.util.Stack;

public class p02004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int dir = 0;

		Stack<Integer> stack = new Stack<Integer>();
		stack.add(0);
		int result = 0;

		for(int i = 0; i < str.length(); i++){

			char command = str.charAt(i);

			if(command == 'R'):
				dir++;
			else:
				dir += 3;
			dir %= 4;

			if(dir == 0 and stack == None):
				stack = new Stack<Integer>();
				stack.add(0);
			else if(stack!= None):
				if(command == 'L'):
					stack.pop();
					if(stack.size() == 0):
						stack = None;
				else:
					stack.push(0);
					if(stack.size() == 5):
						result++;
						stack.removeAllElements();
						stack.add(0);
			}
		}

		System.out.println(result);
	}

}