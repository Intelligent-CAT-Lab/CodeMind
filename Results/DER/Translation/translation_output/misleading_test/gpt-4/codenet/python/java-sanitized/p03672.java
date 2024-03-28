import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.stream.IntStream;

public class p03672 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        // create the lll list equivalent as in Python code
        int[] lll = IntStream.rangeClosed(2, s.length() - 2)
                .filter(i -> i % 2 == 1)
                .map(i -> s.length() - i)
                .toArray();

        for (int i : lll) {
            eprint("range: ", lll);
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            } else {
                eprint("debug : ", "false this time");
            }
        }
    }

    private static void eprint(String... messages) {
        PrintStream errorStream = System.err;
        for (String message : messages) {
            errorStream.print(message);
        }
    }
}