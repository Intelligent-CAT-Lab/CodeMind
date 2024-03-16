<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
from collections import deque

def add_char(s, location, c):
    return s[:location] + c + s[location:]

def main():
    N = int(input())
    set_ = set()
    queue = deque(["357", "375", "537", "573", "735", "753"])
    count = 0
    ch = ['3', '5', '7']

    if N < 1000:
        for s in queue:
            if int(s) <= N:
                count += 1
        print(count)
        return

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

    print(count)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, creates a set and a queue, and then it performs a similar logic to the Java code. The `add_char` function is used to add a character to a string at a specific location. The `main` function is the entry point of the program.<｜end▁of▁sentence｜>
