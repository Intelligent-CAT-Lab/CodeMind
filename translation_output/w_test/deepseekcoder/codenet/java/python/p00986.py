<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
def main():
    s = input()
    n = len(s)

    elements = [0]
    elements_before = []

    def VALID_UNDO():
        elements[-1] = elements[-1] - 1
        elements.append(elements_before.pop())

    def INVALID_UNDO():
        elements.pop()
        elements.append(elements_before.pop())

    def OPEN():
        elements.pop()

    undo = []
    old_states = []

    depth = 0
    ans = 0

    for i in range(n):
        if s[i] != '-':
            old_states.append((depth, ans))
        if s[i] == '(':
            depth += 1
            elements.append(0)
            undo.append(OPEN)
        elif s[i] == ')':
            depth -= 1
            elements_before.append(elements.pop())
            if depth < 0:
                depth = 0
                elements.append(0)
                undo.append(INVALID_UNDO)
            else:
                elements.append(elements[-1] + 1)
                undo.append(VALID_UNDO)

            delta = elements[-1]
            ans += delta
        else:
            state = old_states.pop()
            ans = state[1]
            depth = state[0]
            undo.pop()()
        print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string of characters from the input, and for each character, it performs a different action depending on the character. If the character is '(', it increases the depth and pushes a 0 onto the elements stack. If the character is ')', it decreases the depth and either pushes the top element of the elements stack plus 1 onto the elements stack or pushes a 0 onto the elements stack, depending on whether the depth is less than 0. If the character is '-', it undoes the last operation. The function then prints the current total (the sum of the elements in the elements stack).
<|EOT|>
