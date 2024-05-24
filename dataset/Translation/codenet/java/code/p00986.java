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

