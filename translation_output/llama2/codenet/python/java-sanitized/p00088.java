import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class p00088 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        OutputStream out = System.out;
        InputStreamReader isr = new InputStreamReader(in);
        PrintStream ps = new PrintStream(out);

        Map<Character, String> d1 = new HashMap<>();
        d