import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class p02858 {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            FDISCOSMOS solver = new FDISCOSMOS();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class FDISCOSMOS {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int h = in.readInt();
            int w = in.readInt();
            int t = in.readInt();

            int hh = h / GCDs.gcd(h, t);
            int ww = w / GCDs.gcd(w, t);


            Modular mod = new Modular(1