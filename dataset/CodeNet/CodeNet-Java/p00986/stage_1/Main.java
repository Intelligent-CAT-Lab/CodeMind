import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
var newVariable_0 = in.next();            char[] s = newVariable_0.toCharArray();
            int n = s.length;

            Stack<Integer> elements = new Stack<>();
var newVariable_1 = elements.push(0);            Stack<Integer> elementsBefore = new Stack<>();

            Runnable VALID_UNDO = () -> {
var newVariable_2 = elements.push(elements.pop() - 1);var newVariable_3 = elements.pop();                elements.push(newVariable_3 - 1);
var newVariable_4 = elements.push(elementsBefore.pop());var newVariable_5 = elementsBefore.pop();                elements.push(newVariable_5);
            };
            Runnable INVALID_UNDO = () -> {
var newVariable_6 = elements.pop();var newVariable_7 = elements.push(elementsBefore.pop());var newVariable_8 = elementsBefore.pop();                elements.push(newVariable_8);
            };
            Runnable OPEN = () -> {
var newVariable_9 = elements.pop();            };

            Stack<Runnable> undo = new Stack<>();
            Stack<OldState> oldStates = new Stack<>();

            int depth = 0;
            long ans = 0;


            for (int i = 0; i < n; i++) {
var newVariable_10 = oldStates.push(new OldState(depth, ans));                if (s[i] != '-') newVariable_10;
                if (s[i] == '(') {
                    depth++;
var newVariable_11 = elements.push(0);var newVariable_12 = undo.push(OPEN);                } else if (s[i] == ')') {
                    depth--;
var newVariable_13 = elementsBefore.push(elements.pop());var newVariable_14 = elements.pop();                    elementsBefore.push(newVariable_14);
                    if (depth < 0) {
                        depth = 0;
var newVariable_15 = elements.push(0);var newVariable_16 = undo.push(INVALID_UNDO);                    } else {
var newVariable_17 = elements.push(elements.pop() + 1);var newVariable_18 = elements.pop();                        elements.push(newVariable_18 + 1);
var newVariable_19 = undo.push(VALID_UNDO);                    }

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

