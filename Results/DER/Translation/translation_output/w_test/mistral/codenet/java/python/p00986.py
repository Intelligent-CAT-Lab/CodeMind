<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
(()())---)

Expected output:
0
0
1
1
3
4
3
1
1
2


```
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.function.Supplier;

public class p00986 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
            char[] s = in.next().toCharArray();
            int n = s.length;

            Stack<Integer> elements = new Stack<>();
            elements.push(0);
            Stack<Integer> elementsBefore = new Stack<>();

            Runnable VALID_UNDO = () -> {
                elements.push(elements.pop() - 1);
                elements.push(elementsBefore.pop());
            };
            Runnable INVALID_UNDO = () -> {
                elements.pop();
                elements.push(elementsBefore.pop());
            };
            Runnable OPEN = () -> {
                elements.pop();
            };

            Stack<Runnable> undo = new Stack<>();
            Stack<OldState> oldStates = new Stack<>();

            int depth = 0;
            long ans = 0;


            for (int i = 0; i < n; i++) {
                if (s[i] != '-') oldStates.push(new OldState(depth, ans));
                if (s[i] == '(') {
                    depth++;
                    elements.push(0);
                    undo.push(OPEN);
                } else if (s[i] == ')') {
                    depth--;
                    elementsBefore.push(elements.pop());
                    if (depth < 0) {
                        depth = 0;
                        elements.push(0);
                        undo.push(INVALID_UNDO);
                    } else {
                        elements.push(elements.pop() + 1);
                        undo.push(VALID_UNDO);
                    }

                    int delta =  elements.peek();
                    ans += delta;
                } else {
                    OldState state = oldStates.pop();
                    ans = state.ans;
                    depth = state.depth;
                    undo.pop().run();
                }
                out.println(ans);
            }
        }
    }

    private static class OldState {
        int depth;
        long ans;

        OldState(int depth, long ans) {
            this.depth = depth;
            this.ans = ans;
        }
    }
}


```
[/INST]
```python
import sys

def run(s):
    n = len(s)
    elements = [0]
    elementsBefore = []

    def valid_undo():
        elements.append(elements.pop() - 1)
        elements.append(elementsBefore.pop())

    def invalid_undo():
        elements.pop()
        elements.append(elementsBefore.pop())

    def open():
        elements.pop()

    undo = []
    old_states = []

    depth = 0
    ans = 0

    for i in range(n):
        if s[i] != '-':
            old_states.append(depth, ans)
        if s[i] == '(':
            depth += 1
            elements.append(0)
            undo.append(open)
        elif s[i] == ')':
            depth -= 1
            elementsBefore.append(elements.pop())
            if depth < 0:
                depth = 0
                elements.append(0)
                undo.append(invalid_undo)
            else:
                elements.append(elements.pop() + 1)
                undo.append(valid_undo)

                delta = elements[-1]
                ans += delta
        else:
            old_state = old_states.pop()
            ans = old_state[1]
            depth = old_state[0]
            undo[-1]()

    for _ in range(n):
        print(ans)
        if len(undo) > 0:
            undo[-1]()
        else:
            break

if __name__ == '__main__':
    s = sys.stdin.readline().strip()
    run(s)
```</s>
