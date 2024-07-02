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
System.out.println("[INST]16;input;br.readLine();"+input);
		
		int alphabets[] = new int[26];
		
		for(int i = 0; i < input.length() ; i++){
System.out.println("[INST]20;None;input.length();"+input.length());
			alphabets[input.charAt(i) - 'a']++;
System.out.println("[INST]21;None;input.charAt(i);"+input.charAt(i));
		}
		
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		for(int i = 0; i < alphabets.length; i++){
			if(alphabets[i] != 0){
				pq.add(new Node(alphabets[i], (char)(i + 'a')));
System.out.println("[INST]27;None;pq.add(new Node(alphabets[i], (char)(i + 'a')));"+pq.add(new Node(alphabets[i], (char)(i + 'a'))));
			}
		}
		
		if(pq.size() == 1){
System.out.println("[INST]31;None;pq.size();"+pq.size());
			System.out.println(input.length());
			
			return;
		}
		while(pq.size() > 1){
System.out.println("[INST]36;None;pq.size();"+pq.size());
			Node n1 = pq.remove();
System.out.println("[INST]37;n1;pq.remove();"+n1);
			Node n2 = pq.remove();
System.out.println("[INST]38;n2;pq.remove();"+n2);
			
			Node z = new Node(n1.freq + n2.freq, n1, n2);
			
			pq.add(z);
System.out.println("[INST]42;None;pq.add(z);"+pq.add(z));
		}
		
		Node root = pq.peek();
System.out.println("[INST]45;root;pq.peek();"+root);
		
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

