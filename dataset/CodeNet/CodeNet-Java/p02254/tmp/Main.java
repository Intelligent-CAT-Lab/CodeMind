import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

class Pair implements Comparable<Pair> {
    Node node;
    int frequency;

    Pair(Node node, int frequency) {
        this.node = node;
        this.frequency = frequency;
    }

    public int compareTo(Pair p) {
        return frequency - p.frequency;
    }
}

class Node {
    char c;
    Node parent;

    Node(char c) {
        this.c = c;
    }

    int depth() {
        if(parent == null) return 0;
        return parent.depth() + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
System.out.println("[INST]37;s;sc.next();"+s);
        int[] frequency = new int[26];
        for(int i = 0; i < s.length(); i++) {
System.out.println("[INST]39;None;s.length();"+s.length());
            frequency[s.charAt(i) - 'a']++;
System.out.println("[INST]40;None;s.charAt(i);"+s.charAt(i));
        }

        PriorityQueue<Pair> que = new PriorityQueue<>();
        Map<Character, Node> map = new HashMap<>();
        for(int i = 0; i < 26; i++) {
            int tmp = frequency[i];
            if(tmp > 0) {
                char c = (char)('a' + i);
                Node node = new Node(c);
                que.add(new Pair(node, tmp));
System.out.println("[INST]50;None;que.add(new Pair(node, tmp));"+que.add(new Pair(node, tmp)));
                map.put(c, node);
System.out.println("[INST]51;None;map.put(c, node);"+map.put(c, node));
            }
        }

        while(que.size() > 1) {
System.out.println("[INST]55;None;que.size();"+que.size());
            Pair p1 = que.poll();
System.out.println("[INST]56;p1;que.poll();"+p1);
            Pair p2 = que.poll();
System.out.println("[INST]57;p2;que.poll();"+p2);
            Node n1 = p1.node;
            Node n2 = p2.node;

            Node parent = new Node('.');
            n1.parent = parent;
            n2.parent = parent;
            int newFreq = p1.frequency + p2.frequency;
            que.add(new Pair(parent, newFreq));
System.out.println("[INST]65;None;que.add(new Pair(parent, newFreq));"+que.add(new Pair(parent, newFreq)));
        }

        int res = 0;
        for(int i = 0; i < 26; i++) {
            int tmp = frequency[i];
            if(tmp > 0) {
                char c = (char)('a' + i);
                res += tmp * (map.get(c).depth());
System.out.println("[INST]73;None;map.get(c);"+map.get(c));
            }
        }

        System.out.println(map.size() > 1? res : s.length());
        
        sc.close();
    }
}

