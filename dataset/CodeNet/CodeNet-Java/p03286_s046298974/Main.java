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
            sb.insert (0, String.valueOf (Math.abs (N % base)));
            N -= Math.abs (N % base);
            N /= -base;
        }
        if (sb.length() == 0) sb.append ("0");
        System.out.println (sb);
    }
}
