<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
575

Expected output:
27

```
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;



public class p03212 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<String> ();
		long N = sc.nextInt();
		p03212 main = new p03212();
		Queue<String> queue = new ArrayDeque<String>();
		int count =0;
		char ch[] = {'3','5','7'};
		queue.add("357");
		queue.add("375");
		queue.add("537");
		queue.add("573");
		queue.add("735");
		queue.add("753");
		if (N<1000) {
			for (String s:queue) {
				if (Long.parseLong(s)<=N) {
					count ++;
				}
			}
			System.out.println(count);
			return ;
		}
		while(queue.size()>0) {
			String s = queue.poll();
			if (Long.parseLong(s)<=N) {
				count ++;
				for (int i=0;i<=s.length();i++) {
					for (int j=0;j<ch.length;j++) {
						String temp=main.addChar(s, i, ch[j]);
						if(set.contains(temp)==false) {
							set.add(temp);
							queue.add(temp);
						}
					}
				}
			}
		}
		System.out.println(count);
  	}

	private String addChar(String s,int location,char c) {
		StringBuffer sb = new StringBuffer();
		sb.append(s.substring(0,location));
		sb.append(c);
		if (location<s.length()) {
			sb.append(s.substring(location));
		}
		return sb.toString();
	}
}
```

### Response:
```python
from collections import deque

def add_char(s, location, c):
    return s[:location] + c + s[location:]

def p03212(N):
    set_ = set()
    queue = deque(["357", "375", "537", "573", "735", "753"])
    count = 6
    ch = ['3', '5', '7']

    if N < 1000:
        return sum(1 for s in queue if int(s) <= N)

    while queue:
        s = queue.popleft()
        if int(s) <= N:
            count += 1
            for i in range(len(s) + 1):
                for c in ch:
                    temp = add_char(s, i, c)
                    if temp not in set_:
                        set_.add(temp)
                        queue.append(temp)
    return count

N = int(input())
print(p03212(N))
```

This Python code does the same thing as the Java code. It uses a deque from the collections module as a queue, and a set to store the generated strings. The function `add_char` is used to insert a character at a specific position in a string. The main function `p03212` generates all possible strings by adding a character to each position of the existing strings in the queue, and counts the number of strings that are less than or equal to N.
<|EOT|>
