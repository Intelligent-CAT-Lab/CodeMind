import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Unordered Operators
 */
public class Main {

	static Main main;
	static int[][] PRI;
	static final int[][] _PRI = {
			{1, 2, 3},
			{1, 3, 2},
			{2, 1, 3},
			{2, 3, 1},
			{3, 1, 2},
			{3, 2, 1},
			//
			{1, 1, 2},
			{1, 2, 1},
			{2, 1, 1},
			//
			{2, 2, 1},
			{2, 1, 2},
			{1, 2, 2},
			//
			{2, 2, 2},
	};

	//priority list
	{
		PRI = new int[_PRI.length][128];
		for (int i = 0; i < PRI.length; i++) {
			PRI[i]['('] = 5;
			PRI[i][127] = 4;
			PRI[i]['+'] = _PRI[i][0];
			PRI[i]['-'] = _PRI[i][1];
			PRI[i]['*'] = _PRI[i][2];
			PRI[i][')'] = 0;
			PRI[i]['\0'] = -1;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		main = new Main();

		//parse
		line = br.readLine();
		words = line.split("(?<!\\d)|(?!\\d)");
		List<Elm> expr = new ArrayList<>();

		for (String word : words) {
			char c = word.charAt(0);
			switch (c) {
				case '(':
var newVariable_0 = expr.add(main.new Lp());					break;
				case ')':
var newVariable_1 = expr.add(main.new Rp());					break;
				case '+':
var newVariable_2 = expr.add(main.new Add());					break;
				case '-':
var newVariable_3 = expr.add(main.new Subtract());					break;
				case '*':
var newVariable_4 = expr.add(main.new Multiply());					break;
				default:
var newVariable_5 = expr.add(main.new Num(parseInt(word)));var newVariable_6 = parseInt(word);					expr.add(main.new Num(newVariable_6));
			}
		}

		//solve
		long max = Long.MIN_VALUE;
		for (int i = 0; i < PRI.length; i++) {
			//toString(expr);
			max = Math.max(max, eval(postfix(expr, PRI[i])));
		}
		System.out.println(max);
	}

	static List<Elm> postfix(List<Elm> expr, int[] pri) {
		Deque<Elm> stack = new ArrayDeque<>();
		List<Elm> list = new ArrayList<>();

		stack.push(main.new Nop());
		for (Elm e : expr) {
			int p1, p2;
var newVariable_7 = stack.peek();			p1 = pri[newVariable_7.pri()];
			p2 = pri[e.pri()];
var newVariable_8 = stack.peek();			while (p2 <= p1 && !(newVariable_8 instanceof Lp)) {
var newVariable_9 = list.add(stack.pop());var newVariable_10 = stack.pop();				list.add(newVariable_10);
var newVariable_11 = stack.peek();				p1 = pri[newVariable_11.pri()];
			}
			if (!(e instanceof Rp)) {
				stack.push(e);
			} else {
				//remove '('
var newVariable_12 = stack.pop();			}
		}
var newVariable_13 = stack.peek();		while (!(newVariable_13 instanceof Nop)) {
var newVariable_14 = list.add(stack.pop());var newVariable_15 = stack.pop();			list.add(newVariable_15);
		}
		return list;
	}

	static long eval(List<Elm> expr) {
		Deque<Long> stack = new ArrayDeque<>();

//		toString(expr);

		for (Elm e : expr) {
			if (e instanceof Op) {
				long a, b;
				b = stack.pop();
				a = stack.pop();
				stack.push(((Op) e).operate(a, b));
			} else {
				stack.push(((Num) e).value);
			}
		}
var newVariable_16 = stack.pop();		return newVariable_16;
	}

//	static void toString(List<Elm> expr) {
//		for (Elm e : expr) {
//			if (e instanceof Op) {
//				System.out.print((char) e.pri());
//			} else {
//				System.out.print(((Num) e).value);
//			}
//			System.out.print(' ');
//		}
//		System.out.println();
//	}

	//
	interface Elm {
		int pri();
	}

	interface Op extends Elm {
		long operate(long a, long b);
	}

	class Lp implements Op {

		@Override
		public long operate(long a, long b) {
			return 0;
		}

		@Override
		public int pri() {
			return '(';
		}
	}

	class Rp implements Op {

		@Override
		public long operate(long a, long b) {
			return 0;
		}

		@Override
		public int pri() {
			return ')';
		}
	}

	class Add implements Op {

		@Override
		public long operate(long a, long b) {
			return a + b;
		}

		@Override
		public int pri() {
			return '+';
		}
	}

	class Subtract implements Op {

		@Override
		public long operate(long a, long b) {
			return a - b;
		}

		@Override
		public int pri() {
			return '-';
		}
	}

	class Multiply implements Op {

		@Override
		public long operate(long a, long b) {
			return a * b;
		}

		@Override
		public int pri() {
			return '*';
		}
	}

	class Nop implements Op {

		@Override
		public long operate(long a, long b) {
			return 0;
		}

		@Override
		public int pri() {
			return 0;
		}
	}

	class Num implements Elm {
		long value;

		Num(long value) {
			this.value = value;
		}

		@Override
		public int pri() {
			return 127;
		}
	}
}