<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abca

Expected output:
6


```
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

public class p02254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next();
        int[] frequency = new int[26];
        for(int i = 0; i < s.length(); i++) {
            frequency[s.charAt(i) - 'a']++;
        }

        PriorityQueue<Pair> que = new PriorityQueue<>();
        Map<Character, Node> map = new HashMap<>();
        for(int i = 0; i < 26; i++) {
            int tmp = frequency[i];
            if(tmp > 0) {
                char c = (char)('a' + i);
                Node node = new Node(c);
                que.add(new Pair(node, tmp));
                map.put(c, node);
            }
        }

        while(que.size() > 1) {
            Pair p1 = que.poll();
            Pair p2 = que.poll();
            Node n1 = p1.node;
            Node n2 = p2.node;

            Node parent = new Node('.');
            n1.parent = parent;
            n2.parent = parent;
            int newFreq = p1.frequency + p2.frequency;
            que.add(new Pair(parent, newFreq));
        }

        int res = 0;
        for(int i = 0; i < 26; i++) {
            int tmp = frequency[i];
            if(tmp > 0) {
                char c = (char)('a' + i);
                res += tmp * (map.get(c).depth());
            }
        }

        System.out.println(map.size() > 1? res : s.length());
        
        sc.close();
    }
}


```

python code:<fim_suffix><fim_middle>

```python
import sys
import heapq

class Node:
    def __init__(self, c):
        self.c = c
        self.parent = None

    def depth(self):
        if self.parent == None:
            return 0
        return self.parent.depth() + 1

class Pair:
    def __init__(self, node, frequency):
        self.node = node
        self.frequency = frequency

    def __lt__(self, other):
        return self.frequency > other.frequency

def main():
    s = sys.stdin.readline().strip()
    frequency = [0] * 26
    for c in s:
        frequency[ord(c) - ord('a')] += 1

    que = []
    map = {}
    for i in range(26):
        tmp = frequency[i]
        if tmp > 0:
            c = chr(ord('a') + i)
            node = Node(c)
            heapq.heappush(que, Pair(node, tmp))
            map[c] = node

    while len(que) > 1:
        p1 = heapq.heappop(que)
        p2 = heapq.heappop(que)
        n1 = p1.node
        n2 = p2.node

        parent = Node('.')
        n1.parent = parent
        n2.parent = parent
        newFreq = p1.frequency + p2.frequency
        heapq.heappush(que, Pair(parent, newFreq))

    res = 0
    for i in range(26):
        tmp = frequency[i]
        if tmp > 0:
            c = chr(ord('a') + i)
            res += tmp * (map[c].depth())

    print(len(map) > 1 and res or len(s))

if __name__ == '__main__':
    main()

```
<|endoftext|>
