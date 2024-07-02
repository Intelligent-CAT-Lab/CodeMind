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
System.out.println("[INST]58;line;br.readLine();"+line);
		words = line.split("(?<!\\d)|(?!\\d)");
System.out.println("[INST]59;words;line.split('(?<!\\d)|(?!\\d)');"+words);
		List<Elm> expr = new ArrayList<>();

		for (String word : words) {
			char c = word.charAt(0);
System.out.println("[INST]63;c;word.charAt(0);"+c);
			switch (c) {
				case '(':
					expr.add(main.new Lp());
System.out.println("[INST]66;None;expr.add(main.new Lp());"+expr.add(main.new Lp()));
					break;
				case ')':
					expr.add(main.new Rp());
System.out.println("[INST]69;None;expr.add(main.new Rp());"+expr.add(main.new Rp()));
					break;
				case '+':
					expr.add(main.new Add());
System.out.println("[INST]72;None;expr.add(main.new Add());"+expr.add(main.new Add()));
					break;
				case '-':
					expr.add(main.new Subtract());
System.out.println("[INST]75;None;expr.add(main.new Subtract());"+expr.add(main.new Subtract()));
					break;
				case '*':
					expr.add(main.new Multiply());
System.out.println("[INST]78;None;expr.add(main.new Multiply());"+expr.add(main.new Multiply()));
					break;
				default:
					expr.add(main.new Num(parseInt(word)));
System.out.println("[INST]81;None;expr.add(main.new Num(parseInt(word)));"+expr.add(main.new Num(parseInt(word))));
System.out.println("[INST]81;None;parseInt(word);"+parseInt(word));
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
System.out.println("[INST]98;None;stack.push(main.new Nop());"+stack.push(main.new Nop()));
		for (Elm e : expr) {
			int p1, p2;
			p1 = pri[stack.peek().pri()];
System.out.println("[INST]101;None;stack.peek();"+stack.peek());
			p2 = pri[e.pri()];
			while (p2 <= p1 && !(stack.peek() instanceof Lp)) {
System.out.println("[INST]103;None;stack.peek();"+stack.peek());
				list.add(stack.pop());
System.out.println("[INST]104;None;list.add(stack.pop());"+list.add(stack.pop()));
System.out.println("[INST]104;None;stack.pop();"+stack.pop());
				p1 = pri[stack.peek().pri()];
System.out.println("[INST]105;None;stack.peek();"+stack.peek());
			}
			if (!(e instanceof Rp)) {
				stack.push(e);
System.out.println("[INST]108;None;stack.push(e);"+stack.push(e));
			} else {
				//remove '('
				stack.pop();
System.out.println("[INST]111;None;stack.pop();"+stack.pop());
			}
		}
		while (!(stack.peek() instanceof Nop)) {
System.out.println("[INST]114;None;stack.peek();"+stack.peek());
			list.add(stack.pop());
System.out.println("[INST]115;None;list.add(stack.pop());"+list.add(stack.pop()));
System.out.println("[INST]115;None;stack.pop();"+stack.pop());
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
System.out.println("[INST]128;b;stack.pop();"+b);
				a = stack.pop();
System.out.println("[INST]129;a;stack.pop();"+a);
				stack.push(((Op) e).operate(a, b));
			} else {
				stack.push(((Num) e).value);
System.out.println("[INST]132;None;stack.push(((Num) e).value);"+stack.push(((Num) e).value));
			}
		}
		return stack.pop();
System.out.println("[INST]135;None;stack.pop();"+stack.pop());
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