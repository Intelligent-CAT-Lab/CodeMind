import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int alphabets[] = new int[26];
		
		for(int i = 0; i < input.length() ; i++){
			alphabets[input.charAt(i) - 'a']++;
		}
		
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		for(int i = 0; i < alphabets.length; i++){
			if(alphabets[i] != 0){
				pq.add(new Node(alphabets[i], (char)(i + 'a')));
			}
		}
		
		if(pq.size() == 1){
			System.out.println(input.length());
			
			return;
		}
		while(pq.size() > 1){
			Node n1 = pq.remove();
			Node n2 = pq.remove();
			
			Node z = new Node(n1.freq + n2.freq, n1, n2);
			
			pq.add(z);
		}
		
		Node root = pq.peek();
		
		//System.out.println(root.toString());
		int[] len = new int[26];
		DFS(root, len, 0);
		
		int result = 0;
		for(int i = 0; i < alphabets.length ; i++){
			result += alphabets[i]*len[i];
		}
		System.out.println(result);
	}
	
	static void DFS(Node current, int len[], int depth){
		if(current.isLeaf){
			len[current.c - 'a'] = depth;
			//System.out.println("length of "+current.c+" is "+len[current.c - 'a']);
		}
		else {
			DFS(current.left, len, depth + 1);
			DFS(current.right, len, depth + 1);
		}
	}

}

class Node implements Comparable<Node>{
	int freq;
	boolean isLeaf;
	char c;
	Node left;
	Node right;
	
	Node(int freq, Node l, Node r){
		this.freq = freq;
		isLeaf = false;
		c = 'X';
		this.left = l;
		this.right = r;
		
	}
	
	Node(int freq, char c){
		this.freq = freq;
		this.c = c;
		isLeaf = true;
		this.left = null;
		this.right = null;
				
	}

	@Override
	public int compareTo(Node n0) {
		// TODO Auto-generated method stub
		return this.freq - n0.freq;
	}
	
	public String toString(){
		return c+" "+freq+" "+isLeaf;
	}
}

