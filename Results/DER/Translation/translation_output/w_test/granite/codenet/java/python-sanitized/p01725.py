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
public class p01725 {

	static p01725 main;
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

		main = new p01725();

		//parse
		line = br.readLine();
		words = line.split("(?<!\\d)|(?!\\d)")
		expr = []
		for word in words:
			c = word[0]
			if c == '(':
				expr.append(main.Lp())
			elif c == ')':
				expr.append(main.Rp())
			elif c == '+':
				expr.append(main.Add())
			elif c == '-':
				expr.append(main.Subtract())
			elif c == '*':
				expr.append(main.Multiply())
			else:
				expr.append(main.Num(parseInt(word)))

		#solve
		max = float('-inf')
		for i in range(len(PRI)):
			#toString(expr)
			max = max(max, eval(postfix(expr, PRI[i])))
		print(max)
	}

	static List<Elm> postfix(List<Elm> expr, int[] pri):
		stack = ArrayDeque()
		list = []

		stack.append(main.Nop())
		for e in expr:
			p1 = pri[stack[-1].pri()]
			p2 = pri[e.pri()]
			while p2 <= p1 and not isinstance(stack[-1], main.Lp):
				list.append(stack.pop())
				p1 = pri[stack[-1].pri()]
			if not isinstance(e, main.Rp):
				stack.append(e)
			else:
				#remove '('
				stack.pop()
		while not isinstance(stack[-1], main.Nop):
			list.append(stack.pop())
		return list

	static long eval(List<Elm> expr):
		stack = ArrayDeque()

		for e in expr:
			if isinstance(e, main.Op):
				a = stack.pop()
				b = stack.pop()
				stack.append(e.operate(a, b))
			else:
				stack.append(e.value)
		return stack.pop()

	#toString(expr)
	def toString(expr):
		for e in expr:
			if isinstance(e, main.Op):
				print(chr(e.pri()), end=' ')
			else:
				print(e.value, end=' ')
		print()

	#
	interface Elm:
		def pri(self):
			pass

	interface Op(Elm):
		def operate(self, a, b):
			pass

	class Lp(Op):
		def operate(self, a, b):
			return 0

		def pri(self):
			return '('

	class Rp(Op):
		def operate(self, a, b):
			return 0

		def pri(self):
			return ')'

	class Add(Op):
		def operate(self, a, b):
			return a + b

		def pri(self):
			return '+'

	class Subtract(Op):
		def operate(self, a, b):
			return a - b

		def pri(self):
			return '-'

	class Multiply(Op):
		def operate(self, a, b):
			return a * b

		def pri(self):
			return '*'

	class Nop(Op):
		def operate(self, a, b):
			return 0

		def pri(self):
			return 0

	class Num(Elm):
		def __init__(self, value):
			self.value = value

		def pri(self):
			return 127