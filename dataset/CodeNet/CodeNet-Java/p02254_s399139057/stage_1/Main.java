import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();		char[] arr = newVariable_0.toCharArray();
		int[] alpha = new int[26];
		for (char c : arr) {
		    alpha[c - 'a']++;
		}
		PriorityQueue<Node> queue = new PriorityQueue<>();
	    for (int i = 0; i < 26; i++) {
	        if (alpha[i] > 0) {
var newVariable_1 = queue.add(new Node(i, alpha[i]));	        }
	    }
var newVariable_2 = queue.size();	    if (newVariable_2 == 1) {
	        System.out.println(queue.peek().count);
	        return;
	    }
	    ArrayList<Node> chars = new ArrayList<>();
var newVariable_3 = queue.size();	    while (newVariable_3 > 1) {
	        Node left = queue.poll();
	        Node right = queue.poll();
var newVariable_4 = queue.add(new Node(left, right));	        if (left.isAlpha()) {
var newVariable_5 = chars.add(left);	        }
	        if (right.isAlpha()) {
var newVariable_6 = chars.add(right);	        }
	    }
var newVariable_7 = queue.peek();	    setLength(0, newVariable_7);
	    long total = 0;
	    for (Node x : chars) {
	        total += x.getValue();
	    }
		System.out.println(total);
	}
	
	static void setLength(int length, Node target) {
	    if (target == null) {
	        return;
	    }
	    target.length = length;
	    setLength(length + 1, target.left);
	    setLength(length + 1, target.right);
	}
	
	static class Node implements Comparable<Node> {
	    int idx;
	    Node left;
	    Node right;
	    int count;
	    int length;
	    
	    public Node(int idx, Node left, Node right, int count, int length) {
	        this.idx = idx;
	        this.left = left;
	        this.right = right;
	        this.count = count;
	        this.length = length;
	    }
	    
	    public Node(int idx, int count) {
	        this(idx, null, null, count, 0);
	    }
	    
	    public Node(Node left, Node right) {
	        this(-1, left, right, left.count + right.count, 0);
	    }
	    
	    public boolean isAlpha() {
	        return idx >= 0;
	    }
	    
	    public int compareTo(Node another) {
	        return count - another.count;
	    }
	    
	    public int getValue() {
	        return count * length;
	    }
	}
 }

