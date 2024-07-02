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
System.out.println("[INST]16;None;stack1.push(i);"+stack1.push(i));
            } else if (s[i] == '/' && stack1.size() > 0) {
System.out.println("[INST]17;None;stack1.size();"+stack1.size());
                int j = stack1.pop();
System.out.println("[INST]18;j;stack1.pop();"+j);
                int area = i - j;
                sum += area;
                while (stack2.size() > 0 && stack2.peek()[0] > j) {
System.out.println("[INST]21;None;stack2.size();"+stack2.size());
System.out.println("[INST]21;None;stack2.peek();"+stack2.peek());
                    int[] a = stack2.pop();
System.out.println("[INST]22;a;stack2.pop();"+a);
                    area += a[1];
                }
                stack2.push(new int[]{j, area});
System.out.println("[INST]25;None;stack2.push(new int[]{j, area});"+stack2.push(new int[]{j, area}));
            }
        }

        List<Integer> ans = new ArrayList<>();
        while (!stack2.isEmpty()) {
System.out.println("[INST]30;None;stack2.isEmpty();"+stack2.isEmpty());
            int[] a = stack2.pop();
System.out.println("[INST]31;a;stack2.pop();"+a);
            ans.add(0, a[1]);
System.out.println("[INST]32;None;ans.add(0, a[1]);"+ans.add(0, a[1]));
        }

        pw.println(sum);
        pw.print(ans.size());
        for (int i = 0; i < ans.size(); i++) {
System.out.println("[INST]37;None;ans.size();"+ans.size());
            pw.print(" " + ans.get(i));
        }
        pw.println();
        pw.flush();
System.out.println("[INST]41;None;pw.flush();"+pw.flush());
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
System.out.println("[INST]50;None;tokenizer.hasMoreTokens();"+tokenizer.hasMoreTokens());
                    tokenizer = new StringTokenizer(reader.readLine());
System.out.println("[INST]51;None;reader.readLine();"+reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
System.out.println("[INST]55;None;tokenizer.nextToken();"+tokenizer.nextToken());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
