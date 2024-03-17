<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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
                if (s[i]!= '-') oldStates.push(new OldState(depth, ans));
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

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    s = sys.stdin.readline().strip()
    n = len(s)

    elements = []
    elements.append(0)
    elementsBefore = []

    def VALID_UNDO():
        elements.append(elements.pop() - 1)
        elements.append(elementsBefore.pop())

    def INVALID_UNDO():
        elements.pop()
        elements.append(elementsBefore.pop())

    def OPEN():
        elements.pop()

    undo = []
    oldStates = []

    depth = 0
    ans = 0

    for i in range(n):
        if s[i]!= '-': oldStates.append(OldState(depth, ans))
        if s[i] == '(':
            depth += 1
            elements.append(0)
            undo.append(OPEN)
        elif s[i] == ')':
            depth -= 1
            elementsBefore.append(elements.pop())
            if depth < 0:
                depth = 0
                elements.append(0)
                undo.append(INVALID_UNDO)
            else:
                elements.append(elements.pop() + 1)
                undo.append(VALID_UNDO)

            delta =  elements.peek()
            ans += delta
        else:
            state = oldStates.pop()
            ans = state.ans
            depth = state.depth
            undo.pop()()

        print(ans)

class OldState:
    def __init__(self, depth, ans):
        self.depth = depth
        self.ans = ans

if __name__ == '__main__':
    main()

```
<|endoftext|>
