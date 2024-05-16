System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import re

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
        raise NotImplementedError()

    def calc1(self):
        raise NotImplementedError()

    def __repr__(self):
        return f"({self.get0()}, {self.get1()})"

class VarNode(Node):
    def calc0(self):
        return 1

    def calc1(self):
        return 1

    def __repr__(self):
        return "?"

class AndNode(Node):
    def __init__(self, left, right):
        super().__init__()
        self.left = left
        self.right = right

    def calc0(self):
        return min(self.left.get0(), self.left.get1() + self.right.get0())

    def calc1(self):
        return self.left.get1() + self.right.get1()

    def __repr__(self):
        return f"({self.left} & {self.right})"

class OrNode(Node):
    def __init__(self, left, right):
        super().__init__()
        self.left = left
        self.right = right

    def calc0(self):
        return self.left.get0() + self.right.get0()

    def calc1(self):
        return min(self.left.get1(), self.left.get0() + self.right.get1())

    def __repr__(self):
        return f"({self.left} | {self.right})"

class Parser:
    def __init__(self, s):
        self.text = s + "$"
        self.cur = 0

    def get_term(self):
        c = self.text[self.cur]
        if c == "?":
            self.cur += 1
            return VarNode()
        if c == "(":
            self.cur += 1
            node = self.get_or_expr()
            assert self.text[self.cur] == ")"
            self.cur += 1
            return node
        raise Exception("Invalid character")

    def get_and_expr(self):
        node = self.get_term()
        while self.text[self.cur] == "&":
            self.cur += 1
            r = self.get_term()
            node = AndNode(node, r)
        return node

    def get_or_expr(self):
        node = self.get_and_expr()
        while self.text[self.cur] == "|":
            self.cur += 1
            r = self.get_and_expr()
            node = OrNode(node, r)
        return node

    def get_formula(self):
        return self.get_or_expr()

```<|endoftext|>
