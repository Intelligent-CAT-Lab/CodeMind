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
                stack1.push(i);
            } else if (s[i] == '/' && stack1.size() > 0) {
                int j = stack1.pop();
                int area = i - j;
                sum += area;
                while (stack2.size() > 0 && stack2.peek()[0] > j) {
                    int[] a = stack2.pop();
                    area += a[1];
                }
                stack2.push(new int[]{j, area});
            }
        }

        List<Integer> ans = new ArrayList<>();
        while (!stack2.isEmpty()) {
            int[] a = stack2.pop();
            ans.add(0, a[1]);
        }

        pw.println(sum);
        pw.print(ans.size());
        for (int i = 0; i < ans.size(); i++) {
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
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
