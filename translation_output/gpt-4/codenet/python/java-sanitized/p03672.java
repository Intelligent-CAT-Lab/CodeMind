import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.stream.IntStream;

public class p03672 {
    private static final Scanner sc = new Scanner(System.in);
    private static final PrintWriter stderr = new PrintWriter(System.err, true);
    
    public static void eprint(Object... objects) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        for (Object o : objects) {
            printWriter.print(o);
            printWriter.print(" ");
        }
        stderr.println(stringWriter.toString());
        printWriter.close();
    }
    
    public static IntStream reverseRange(int start, int stop, int step) {
        return IntStream.rangeClosed(stop + step, start - step)
            .filter(n -> (start - n) % step == 0)
            .map(n -> (start - n) / step * step + stop);
    }
    
    public static IntStream crange(int start, int stop, int step) {
        return IntStream.rangeClosed(start, stop).filter(n -> (n - start) % step == 0);
    }
    
    public static IntStream reverseCrange(int start, int stop, int step) {
        return IntStream.iterate(stop, i -> i >= start, i -> i - step);
    }
    
    public static void main(String[] args) {
        String s = sc.nextLine().trim();
        int[] lll = reverseRange(s.length() - 2, 1, 2).toArray();
        for (int i : lll) {
            eprint("range: ");
            eprint(lll);
            // int closedI = i + 1; // Unused variable in Python code, so we comment it in Java as well
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            } else {
                eprint("debug : false this time");
            }
        }
    }
}