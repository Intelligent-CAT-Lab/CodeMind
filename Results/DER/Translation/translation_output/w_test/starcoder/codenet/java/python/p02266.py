<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
\\//

Expected output:
4
1 4


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Stack;

public class p02266 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		String profile = reader.readLine();
		
		Stack<Integer> stackDown = new Stack<Integer>();
		Stack<Integer> stackArea = new Stack<Integer>();
		Stack<Integer> stackEdge = new Stack<Integer>();
		int totalArea = 0;
		int pos = 0;
		int lv = 0;
		
		for (char c : profile.toCharArray()) {
			if (c == '\\') {
				lv--;
				stackDown.push(pos);
			} else if (c == '/') {
				lv++;
				if (!stackDown.empty()) {
					int start = stackDown.pop();
					int tempArea = pos - start;
					totalArea += tempArea;
					if (stackArea.empty()) {
						stackArea.push(tempArea);
						stackEdge.push(lv);
					} else {
						int lastArea = 0;
						while (!stackEdge.empty() && stackEdge.peek() < lv) {
							lastArea += stackArea.pop();
							stackEdge.pop();
						}
						stackArea.push(lastArea + tempArea);
						stackEdge.push(lv);
					}
				} else {
					if (!stackArea.empty()) {
						stackEdge.pop();
						stackEdge.push(lv);
					}
				}
			}
			pos++;
		}

		System.out.println(totalArea);
		System.out.print(stackArea.size());
		if (stackArea.size()!= 0) {
			System.out.print(" ");
		}
		Iterator<Integer> itr = stackArea.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
			if (itr.hasNext()) {
				System.out.print(" ");
			}
		}
		System.out.println("");
	}
}


```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
	profile = sys.stdin.readline().strip()
	stackDown = []
	stackArea = []
	stackEdge = []
	totalArea = 0
	pos = 0
	lv = 0
	for c in profile:
		if c == '\\':
			lv -= 1
			stackDown.append(pos)
		elif c == '/':
			lv += 1
			if len(stackDown)!= 0:
				start = stackDown.pop()
				tempArea = pos - start
				totalArea += tempArea
				if len(stackArea) == 0:
					stackArea.append(tempArea)
					stackEdge.append(lv)
				else:
					lastArea = 0
					while len(stackEdge)!= 0 and stackEdge[-1] < lv:
						lastArea += stackArea.pop()
						stackEdge.pop()
					stackArea.append(lastArea + tempArea)
					stackEdge.append(lv)
			else:
				if len(stackArea)!= 0:
					stackEdge.pop()
					stackEdge.append(lv)
		pos += 1
	print(totalArea)
	print(len(stackArea))
	if len(stackArea)!= 0:
		print(" ")
	for i in stackArea:
		print(i, end=' ')
	print("")

if __name__ == "__main__":
	main()

```
<|endoftext|>
