Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import java.util.ArrayDeque
import java.util.HashSet
import java.util.Queue
import java.util.Scanner
import java.util.Set

class p03212:
    def __init__(self):
        pass
    
    def addChar(self, s, location, c):
        sb = StringBuffer()
        sb.append(s[:location])
        sb.append(c)
        if location<len(s):
            sb.append(s[location:])
        return sb.toString()
    
    def main(self):
        sc = Scanner(System.in)
        set = HashSet()
        N = sc.nextInt()
        main = p03212()
        queue = ArrayDeque()
        count = 0
        ch = ['3','5','7']
        queue.add("357")
        queue.add("375")
        queue.add("537")
        queue.add("573")
        queue.add("735")
        queue.add("753")
        if N<1000:
            for s in queue:
                if Long.parseLong(s)<=N:
                    count += 1
            print(count)
            return
        while queue.size()>0:
            s = queue.poll()
            if Long.parseLong(s)<=N:
                count += 1
                for i in range(len(s)+1):
                    for j in range(len(ch)):
                        temp = main.addChar(s, i, ch[j])
                        if set.contains(temp)==False:
                            set.add(temp)
                            queue.add(temp)
        print(count)

if __name__ == '__main__':
    p03212().main()
```<|endoftext|>
