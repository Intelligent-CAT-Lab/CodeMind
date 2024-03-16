<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 解答

```python
import java.util.Scanner;

class Node:
    def __init__(self, cost0, cost1):
        self.cost0 = cost0
        self.cost1 = cost1

    def get0(self):
        return self.cost0

    def get1(self):
        return self.cost1

    def __str__(self):
        return str(self.cost0) + " " + str(self.cost1)

class VarNode(Node):
    def calc0(self):
        return 1

    def calc1(self):
        return 1

    def __str__(self):
        return "?"

class AndNode(Node):
    def __init__(self, left, right):
        super().__init__(left.get0(), left.get1() + right.get0())
        self.left = left
        self.right = right

    def calc0(self):
        return self.left.get0() + self.right.get0()

    def calc1(self):
        return self.left.get1() + self.right.get1()

    def __str__(self):
        return "(" + str(self.left) + "&" + str(self.right) + ")"

class OrNode(Node):
    def __init__(self, left, right):
        super().__init__(left.get0() + right.get0(), left.get1() + right.get1())
        self.left = left
        self.right = right

    def calc0(self):
        return self.left.get0() + self.right.get0()

    def calc1(self):
        return self.left.get1() + self.right.get1()

    def __str__(self):
        return "(" + str(self.left) + "|" + str(self.right) + ")"

class Parser:
    def __init__(self, text):
        self.text = text
        self.cur = 0

    def getTerm(self):
        c = self.text[self.cur]
        if c == '?':
            self.cur += 1
            return VarNode()
        if c == '(':
            self.cur += 1
            node = self.getOrExpr()
            assert self.text[self.cur] == ')'
            self.cur += 1
            return node
        raise Exception

    def getAndExpr(self):
        node = self.getTerm()
        while self.text[self.cur] == '&':
            self.cur += 1
            node = AndNode(node, self.getTerm())
        return node

    def getOrExpr(self):
        node = self.getAndExpr()
        while self.text[self.cur] == '|':
            self.cur += 1
            node = OrNode(node, self.getAndExpr())
        return node

    def getFormula(self):
        return self.getOrExpr()

def main():
    sc = Scanner(System.in)
    s = sc.nextLine()
    parser = Parser(s)
    node = parser.getFormula()
    print(node.get0() + " " + node.get1())

if __name__ == '__main__':
    main()
```
</s>
