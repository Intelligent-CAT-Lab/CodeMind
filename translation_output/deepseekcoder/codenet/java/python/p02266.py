<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
		if (stackArea.size() != 0) {
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

### Response:
```python
import sys

def main():
    profile = sys.stdin.readline().strip()

    stack_down = []
    stack_area = []
    stack_edge = []
    total_area = 0
    pos = 0
    lv = 0

    for c in profile:
        if c == '\\':
            lv -= 1
            stack_down.append(pos)
        elif c == '/':
            lv += 1
            if stack_down:
                start = stack_down.pop()
                temp_area = pos - start
                total_area += temp_area
                if not stack_area:
                    stack_area.append(temp_area)
                    stack_edge.append(lv)
                else:
                    last_area = 0
                    while stack_edge and stack_edge[-1] < lv:
                        last_area += stack_area.pop()
                        stack_edge.pop()
                    stack_area.append(last_area + temp_area)
                    stack_edge.append(lv)
            else:
                if stack_area:
                    stack_edge.pop()
                    stack_edge.append(lv)
        pos += 1

    print(total_area)
    print(len(stack_area), *stack_area)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, and then processes each character in the string. If the character is '\' it decreases the level `lv` and pushes the position to the `stack_down`. If the character is '/' it increases the level `lv` and calculates the area. The area is added to `total_area` and the area and level are pushed to `stack_area` and `stack_edge` respectively. The final result is printed to the standard output.
<|EOT|>
