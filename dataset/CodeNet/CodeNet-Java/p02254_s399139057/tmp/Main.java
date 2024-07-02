import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
System.out.println("[INST]5;arr;sc.next().toCharArray();"+arr);
System.out.println("[INST]5;None;sc.next();"+sc.next());
		int[] alpha = new int[26];
		for (char c : arr) {
		    alpha[c - 'a']++;
		}
		PriorityQueue<Node> queue = new PriorityQueue<>();
	    for (int i = 0; i < 26; i++) {
	        if (alpha[i] > 0) {
	            queue.add(new Node(i, alpha[i]));
System.out.println("[INST]13;None;queue.add(new Node(i, alpha[i]));"+queue.add(new Node(i, alpha[i])));
	        }
	    }
	    if (queue.size() == 1) {
System.out.println("[INST]16;None;queue.size();"+queue.size());
	        System.out.println(queue.peek().count);
	        return;
	    }
	    ArrayList<Node> chars = new ArrayList<>();
	    while (queue.size() > 1) {
System.out.println("[INST]21;None;queue.size();"+queue.size());
	        Node left = queue.poll();
System.out.println("[INST]22;left;queue.poll();"+left);
	        Node right = queue.poll();
System.out.println("[INST]23;right;queue.poll();"+right);
	        queue.add(new Node(left, right));
System.out.println("[INST]24;None;queue.add(new Node(left, right));"+queue.add(new Node(left, right)));
	        if (left.isAlpha()) {
	            chars.add(left);
System.out.println("[INST]26;None;chars.add(left);"+chars.add(left));
	        }
	        if (right.isAlpha()) {
	            chars.add(right);
System.out.println("[INST]29;None;chars.add(right);"+chars.add(right));
	        }
	    }
	    setLength(0, queue.peek());
System.out.println("[INST]32;None;queue.peek();"+queue.peek());
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

