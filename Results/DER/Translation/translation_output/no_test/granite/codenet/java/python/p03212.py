System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import queue

def main():
    N = int(input())
    set = set()
    queue = queue.Queue()
    count = 0
    ch = ['3', '5', '7']
    queue.put('357')
    queue.put('375')
    queue.put('537')
    queue.put('573')
    queue.put('735')
    queue.put('753')
    if N < 1000:
        while not queue.empty():
            s = queue.get()
            if int(s) <= N:
                count += 1
        print(count)
        return
    while not queue.empty():
        s = queue.get()
        if int(s) <= N:
            count += 1
            for i in range(len(s) + 1):
                for j in range(len(ch)):
                    temp = add_char(s, i, ch[j])
                    if temp not in set:
                        set.add(temp)
                        queue.put(temp)
    print(count)

def add_char(s, location, c):
    return s[:location] + c + s[location:]

if __name__ == "__main__":
    main()
```<|endoftext|>
