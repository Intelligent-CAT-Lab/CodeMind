import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in))) {
            final String s = reader.readLine();
System.out.println("[INST]10;s;reader.readLine();"+s);

            final String sl[] = s.split(" ");
System.out.println("[INST]12;sl;s.split(' ');"+sl);
            int A = Integer.parseInt(sl[0]);
System.out.println("[INST]13;A;Integer.parseInt(sl[0]);"+A);
            int B = Integer.parseInt(sl[1]);
System.out.println("[INST]14;B;Integer.parseInt(sl[1]);"+B);

            System.out.println(
                A % 3 == 0 || B % 3 == 0 || (A + B) % 3 == 0 ?
                    "Possible" : "Impossible");
        }
    }
}
