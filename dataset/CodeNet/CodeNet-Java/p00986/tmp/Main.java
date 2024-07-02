import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in); PrintWriter out = new PrintWriter(System.out)) {
            char[] s = in.next().toCharArray();
System.out.println("[INST]8;s;in.next().toCharArray();"+s);
System.out.println("[INST]8;None;in.next();"+in.next());
            int n = s.length;

            Stack<Integer> elements = new Stack<>();
            elements.push(0);
System.out.println("[INST]12;None;elements.push(0);"+elements.push(0));
            Stack<Integer> elementsBefore = new Stack<>();

            Runnable VALID_UNDO = () -> {
                elements.push(elements.pop() - 1);
System.out.println("[INST]16;None;elements.push(elements.pop() - 1);"+elements.push(elements.pop() - 1));
System.out.println("[INST]16;None;elements.pop();"+elements.pop());
                elements.push(elementsBefore.pop());
System.out.println("[INST]17;None;elements.push(elementsBefore.pop());"+elements.push(elementsBefore.pop()));
System.out.println("[INST]17;None;elementsBefore.pop();"+elementsBefore.pop());
            };
            Runnable INVALID_UNDO = () -> {
                elements.pop();
System.out.println("[INST]20;None;elements.pop();"+elements.pop());
                elements.push(elementsBefore.pop());
System.out.println("[INST]21;None;elements.push(elementsBefore.pop());"+elements.push(elementsBefore.pop()));
System.out.println("[INST]21;None;elementsBefore.pop();"+elementsBefore.pop());
            };
            Runnable OPEN = () -> {
                elements.pop();
System.out.println("[INST]24;None;elements.pop();"+elements.pop());
            };

            Stack<Runnable> undo = new Stack<>();
            Stack<OldState> oldStates = new Stack<>();

            int depth = 0;
            long ans = 0;


            for (int i = 0; i < n; i++) {
                if (s[i] != '-') oldStates.push(new OldState(depth, ans));
System.out.println("[INST]35;None;oldStates.push(new OldState(depth, ans));"+oldStates.push(new OldState(depth, ans)));
                if (s[i] == '(') {
                    depth++;
                    elements.push(0);
System.out.println("[INST]38;None;elements.push(0);"+elements.push(0));
                    undo.push(OPEN);
System.out.println("[INST]39;None;undo.push(OPEN);"+undo.push(OPEN));
                } else if (s[i] == ')') {
                    depth--;
                    elementsBefore.push(elements.pop());
System.out.println("[INST]42;None;elementsBefore.push(elements.pop());"+elementsBefore.push(elements.pop()));
System.out.println("[INST]42;None;elements.pop();"+elements.pop());
                    if (depth < 0) {
                        depth = 0;
                        elements.push(0);
System.out.println("[INST]45;None;elements.push(0);"+elements.push(0));
                        undo.push(INVALID_UNDO);
System.out.println("[INST]46;None;undo.push(INVALID_UNDO);"+undo.push(INVALID_UNDO));
                    } else {
                        elements.push(elements.pop() + 1);
System.out.println("[INST]48;None;elements.push(elements.pop() + 1);"+elements.push(elements.pop() + 1));
System.out.println("[INST]48;None;elements.pop();"+elements.pop());
                        undo.push(VALID_UNDO);
System.out.println("[INST]49;None;undo.push(VALID_UNDO);"+undo.push(VALID_UNDO));
                    }

                    int delta =  elements.peek();
System.out.println("[INST]52;delta;elements.peek();"+delta);
                    ans += delta;
                } else {
                    OldState state = oldStates.pop();
System.out.println("[INST]55;state;oldStates.pop();"+state);
                    ans = state.ans;
                    depth = state.depth;
                    undo.pop().run();
System.out.println("[INST]58;None;undo.pop().run();"+undo.pop().run());
System.out.println("[INST]58;None;undo.pop();"+undo.pop());
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

