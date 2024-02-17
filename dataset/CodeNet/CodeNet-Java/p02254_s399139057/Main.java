import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int[] alpha = new int[26];
		for (char c : arr) {
		    alpha[c - 'a']++;
		}
		PriorityQueue<Node> queue = new PriorityQueue<>();
	    for (int i = 0; i < 26; i++) {
	        if (alpha[i] > 0) {
	            queue.add(new Node(i, alpha[i]));
	        }
	    }
	    if (queue.size() == 1) {
	        System.out.println(queue.peek().count);
	        return;
	    }
	    ArrayList<Node> chars = new ArrayList<>();
	    while (queue.size() > 1) {
	        Node left = queue.poll();
	        Node right = queue.poll();
	        queue.add(new Node(left, right));
	        if (left.isAlpha()) {
	            chars.add(left);
	        }
	        if (right.isAlpha()) {
	            chars.add(right);
	        }
	    }
	    setLength(0, queue.peek());
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

