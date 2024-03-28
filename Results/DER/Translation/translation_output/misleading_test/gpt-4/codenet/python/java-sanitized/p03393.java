import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class p03393 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char tmp = (char) (i + 'a');
                if (!s.contains(String.valueOf(tmp))) {
                    System.out.println(s + tmp);
                    return;
                }
            }
        } else {
            for (int i = 25; i >= 0; i--) {
                for (char j = (char) (s.charAt(i) + 1); j <= 'z'; j++) {
                    if (!s.substring(0, i).contains(String.valueOf(j))) {
                        System.out.println(s.substring(0, i) + j);
                        return;
                    }
                }
            }
            System.out.println(-1);
            return;
        }
    }
}