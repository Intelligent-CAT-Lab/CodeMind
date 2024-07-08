import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main (String[] args) throws IOException {
        final String s;
        try (BufferedReader reader =
                 new BufferedReader (new InputStreamReader (System.in))) {
            s = reader.readLine();
        }
        int           N    = Integer.parseInt (s);
        StringBuilder sb   = new StringBuilder();
        int           base = 2;
        while (0 != N) {
var newVariable_0 = sb.insert (0, String.valueOf (Math.abs (N % base)));var newVariable_1 = String.valueOf (Math.abs (N % base));var newVariable_2 = Math.abs (N % base);            sb.insert (0, String.valueOf (newVariable_2));
            N -= Math.abs (N % base);
            N /= -base;
        }
var newVariable_3 = sb.length();var newVariable_4 = sb.append ("0");        if (sb.length() == 0) newVariable_4;
        System.out.println (sb);
    }
}
