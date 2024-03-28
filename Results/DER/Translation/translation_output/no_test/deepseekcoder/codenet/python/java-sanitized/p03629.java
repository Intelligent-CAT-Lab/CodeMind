import java.util.*;
import java.io.*;

public class p03629 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static String[] nextStringArray() throws IOException {
        return next().split(" ");
    }

    static int[] nextIntArray() throws IOException {
        String[] s = nextStringArray();
        int[] a = new int[s.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        return a;
    }

    static String[] readLines(int n) throws IOException {
        String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            lines[i] = next();
        }
        return lines;
    }

    static String listToString(List<?> list, String sep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(sep);
            }
            sb.append(list.get(i));
        }
        return sb.toString();
    }

    static List<List<Integer>> makeList(int[] shape, int value) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < shape[0]; i++) {
            list.add(new ArrayList<>(Collections.nCopies(shape.length > 1 ? shape[1] : 1, value)));
        }
        return list;
    }

    static String solveCase() throws IOException {
        String S = next();
        int lenS = S.length();
        int[] intS = new int[lenS];
        for (int i = 0; i < lenS; i++) {
            intS[i] = S.charAt(i) - 'a';
        }

        List<List<Integer>> nextCharPos = makeList(new int[]{lenS + 1, 26}, lenS);
        for (int fromIdx = lenS - 1; fromIdx >= 0; fromIdx--) {
            for (int letterIdx = 0; letterIdx < 26; letterIdx++) {
                int pos = intS[fromIdx] == letterIdx ? fromIdx : nextCharPos.get(fromIdx + 1).get(letterIdx);
                nextCharPos.get(fromIdx).set(letterIdx, pos);
            }
        }

        List<Integer> nonSubseqLen = makeList(new int[]{lenS + 2}, lenS + 1);
        nonSubseqLen.set(lenS, 1);
        nonSubseqLen.set(lenS + 1, 0);
        List<Integer> ansNextPos = makeList(new int[]{lenS + 1}, -1);
        List<Integer> ansLetter = makeList(new int[]{lenS + 1}, -1);
        for (int fromIdx = lenS - 1; fromIdx >= 0; fromIdx--) {
            for (int letterIdx = 0; letterIdx < 26; letterIdx++) {
                int newLen = nonSubseqLen.get(nextCharPos.get(fromIdx).get(letterIdx) + 1) + 1;
                if (nonSubseqLen.get(fromIdx) > newLen) {
                    nonSubseqLen.set(fromIdx, newLen);
                    ansLetter.set(fromIdx, letterIdx);
                    ansNextPos.set(fromIdx, nextCharPos.get(fromIdx).get(letterIdx) + 1);
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        int idx = 0;
        while (idx < lenS) {
            ans.append((char) ('a' + ansLetter.get(idx)));
            idx = ansNextPos.get(idx);
        }
        return ans.toString();
    }

    public static void main(String[] args) throws IOException {
        pr.println(sol