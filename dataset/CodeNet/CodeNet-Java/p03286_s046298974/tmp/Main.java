import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main (String[] args) throws IOException {
        final String s;
        try (BufferedReader reader =
                 new BufferedReader (new InputStreamReader (System.in))) {
            s = reader.readLine();
System.out.println("[INST]8;s;reader.readLine();"+s);
        }
        int           N    = Integer.parseInt (s);
System.out.println("[INST]10;N;Integer.parseInt (s);"+N);
        StringBuilder sb   = new StringBuilder();
        int           base = 2;
        while (0 != N) {
            sb.insert (0, String.valueOf (Math.abs (N % base)));
System.out.println("[INST]14;None;sb.insert (0, String.valueOf (Math.abs (N % base)));"+sb.insert (0, String.valueOf (Math.abs (N % base))));
System.out.println("[INST]14;None;String.valueOf (Math.abs (N % base));"+String.valueOf (Math.abs (N % base)));
System.out.println("[INST]14;None;Math.abs (N % base);"+Math.abs (N % base));
            N -= Math.abs (N % base);
System.out.println("[INST]15;N;Math.abs (N % base);"+N);
            N /= -base;
        }
        if (sb.length() == 0) sb.append ("0");
System.out.println("[INST]18;None;sb.length();"+sb.length());
System.out.println("[INST]18;None;sb.append ('0');"+sb.append ("0"));
        System.out.println (sb);
System.out.println("[INST]19;None;System.out.println (sb);"+System.out.println (sb));
    }
}
