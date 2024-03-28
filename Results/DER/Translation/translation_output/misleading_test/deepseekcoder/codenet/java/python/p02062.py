<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
?&?|?&?|?&?

Expected output:
81 -63

```
import java.util.Scanner;

// Java8
public class p02062
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception
	{
		new p02062().run();
	}
	
	void run()
	{
		String s = sc.nextLine();
		Parser parser = new Parser(s);
		Node node = parser.getFormula();
		System.out.println(node.get0() + " " + node.get1());
	}
}
abstract class Node {
	private int cost0 = 0;
	private int cost1 = 0;

	public final int get0() {
		if(cost0>0) return cost0;
		return cost0 = calc0();
	}

	public final int get1() {
		if(cost1>0) return cost1;
		return cost1 = calc1();
	}

	abstract int calc0();

	abstract int calc1();
}
class VarNode extends Node {

	@Override
	int calc0()
	{
		return 1;
	}

	@Override
	int calc1()
	{
		return 1;
	}

	@Override
	public String toString()
	{
		return "?";
	}
}
class AndNode extends Node {
	private Node left;
	private Node right;

	public AndNode(Node l, Node r)
	{
		left = l;
		right = r;
	}

	@Override
	int calc0()
	{
		return Math.min(left.get0(), left.get1() + right.get0());
	}

	@Override
	int calc1()
	{
		return left.get1() + right.get1();
	}

	@Override
	public String toString()
	{
		return "(" + left.toString() + "&" + right.toString() + ")";
	}
}
class OrNode extends Node {
	private Node left;
	private Node right;

	public OrNode(Node l, Node r)
	{
		left = l;
		right = r;
	}

	@Override
	int calc0()
	{
		return left.get0() + right.get0();
	}

	@Override
	int calc1()
	{
		return Math.min(left.get1(), left.get0() + right.get1());
	}

	@Override
	public String toString()
	{
		return "(" + left.toString() + "|" + right.toString() + ")";
	}
}
class Parser {
	private String text;
	int cur;

	public Parser(String s) {
		text = s + "$";
		cur = 0;
	}

	public Node getTerm() {
		char c = text.charAt(cur);
		if(c=='?') {
			cur++;
			return new VarNode();
		}
		if(c=='(') {
			cur++;
			Node node = getOrExpr();
			assert(text.charAt(cur) == ')');
			cur++;
			return node;
		}
		throw new IllegalStateException();
	}

	public Node getAndExpr() {
		Node node = getTerm();
		while(text.charAt(cur)=='&') {
			cur++;
			Node r = getTerm();
			node = new AndNode(node, r);
		}
		return node;
	}

	public Node getOrExpr() {
		Node node = getAndExpr();
		while(text.charAt(cur)=='|') {
			cur++;
			Node r = getAndExpr();
			node = new OrNode(node, r);
		}
		return node;
	}
	
	public Node getFormula() {
		return getOrExpr();
	}

}

```

### Response:
```python
import sys

class Node:
    def __init__(self):
        self.cost0 = 0
        self.cost1 = 0

    def get0(self):
        if self.cost0 > 0:
            return self.cost0
        self.cost0 = self.calc0()
        return self.cost0

    def get1(self):
        if self.cost1 > 0:
            return self.cost1
        self.cost1 = self.calc1()
        return self.cost1

    def calc0(self):
        pass

    def calc1(self):
        pass

class VarNode(Node):
    def calc0(self):
        return 1

    def calc1(self):
        return 1

    def __str__(self):
        return "?"

class AndNode(Node):
    def __init__(self, l, r):
        super().__init__()
        self.left = l
        self.right = r

    def calc0(self):
        return min(self.left.get0(), self.left.get1() + self.right.get0())

    def calc1(self):
        return self.left.get1() + self.right.get1()

    def __str__(self):
        return "(" + str(self.left) + "&" + str(self.right) + ")"

class OrNode(Node):
    def __init__(self, l, r):
        super().__init__()
        self.left = l
        self.right = r

    def calc0(self):
        return self.left.get0() + self.right.get0()

    def calc1(self):
        return min(self.left.get1(), self.left.get0() + self.right.get1())

    def __str__(self):
        return "(" + str(self.left) + "|" + str(self.right) + ")"

class Parser:
    def __init__(self, s):
        self.text = s + "$"
        self.cur = 0

    def getTerm(self):
        c = self.text[self.cur]
        if c == '?':
            self.cur += 1
            return VarNode()
        elif c == '(':
            self.cur += 1
            node = self.getOrExpr()
            assert(self.text[self.cur] == ')')
            self.cur += 1
            return node
        raise Exception("Unexpected character")

    def getAndExpr(self):
        node = self.getTerm()
        while self.text[self.cur] == '&':
            self.cur += 1
            r = self.getTerm()
            node = AndNode(node, r)
        return node

    def getOrExpr(self):
        node = self.getAndExpr()
        while self.text[self.cur] == '|':
            self.cur += 1
            r = self.getAndExpr()
            node = OrNode(node, r)
        return node

    def getFormula(self):
        return self.getOrExpr()

def main():
    s = sys.stdin.readline().strip()
    parser = Parser(s)
    node = parser.getFormula()
    print(node.get0(), node.get1())

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from standard input, parses it into a formula, and then prints the values of the formula at two different states (0 and 1). The formula is represented as a tree of nodes, where each node is either a variable (VarNode), an AND operation (AndNode), or an OR operation (OrNode). The calc0 and calc1 methods of each node calculate the value of the formula at two different states. The Parser class parses the input string into a formula.
<|EOT|>
