import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Punctuation {
    public static boolean isLatinLetter(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean isPunctuation(char c) {
        if (c == '.') return true;
        if (c == ',') return true;
        if (c == '!') return true;
        if (c == '?') return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        sb.append(s.charAt(0));
        for (int i = 1; i < n; i++) {
            char c = s.charAt(i);
            if (isLatinLetter(c)) {
                if (!isLatinLetter(s.charAt(i - 1))) {
                    sb.append('▁');
                }
                sb.append(c);
            } else if (isPunctuation(c)) {
                sb.append(c);
            }
        }
        pw.println(sb);
        pw.flush();
        pw.close();
    }
}