import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03150 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String S = reader.readLine();

        for (int i = 0; i < S.length(); i++) {
            for (int j = i; j <= S.length(); j++) {
                if (S.substring(0, i).concat(S.substring(j)).equals("keyence")) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        
        for (int i = 1; i < S.length(); i++) {
            if (i + 7 < S.length()) {
                String subSeq = "";
                for (int k = 0; k < S.length(); k += i + 1) {
                    if (k < S.length()) {
                        subSeq += S.charAt(k);
                    }
                }
                if (subSeq.equals("keyence")) {
                    System.out.println("YES");
                    return;
                }
            }
        }

        System.out.println("NO");
    }
}