import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter pw = new PrintWriter(System.out);

        char[] s = sc.next().toCharArray();

        Stack<Integer> stack1 = new Stack<>();
        Stack<int[]> stack2 = new Stack<>();

        int sum = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '\\') {
var newVariable_0 = stack1.push(i);var newVariable_1 = stack1.size();            } else if (s[i] == '/' && newVariable_1 > 0) {
                int j = stack1.pop();
                int area = i - j;
                sum += area;
var newVariable_2 = stack2.size();var newVariable_3 = stack2.peek();                while (stack2.size() > 0 && newVariable_3[0] > j) {
                    int[] a = stack2.pop();
                    area += a[1];
                }
var newVariable_4 = stack2.push(new int[]{j, area});            }
        }

        List<Integer> ans = new ArrayList<>();
var newVariable_5 = stack2.isEmpty();        while (!newVariable_5) {
            int[] a = stack2.pop();
            ans.add(0, a[1]);
        }

        pw.println(sum);
        pw.print(ans.size());
var newVariable_6 = ans.size();        for (int i = 0; i < newVariable_6; i++) {
            pw.print(" " + ans.get(i));
        }
        pw.println();
        pw.flush();
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
var newVariable_7 = tokenizer.hasMoreTokens();                while (tokenizer == null || !newVariable_7) {
var newVariable_8 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_8);
                }
            } catch (IOException ignored) {
            }
var newVariable_9 = tokenizer.nextToken();            return newVariable_9;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
