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
 * Built using CHelper plug-in Actual solution is at the top
 * 
 * @author daltao
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "daltao", 1 << 27);
        thread.start();
System.out.println("[INST]19;None;thread.start();"+thread.start());
        thread.join();
System.out.println("[INST]20;None;thread.join();"+thread.join());
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            TaskA solver = new TaskA();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskA {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            String s = in.readString();
            int cIndex = s.indexOf('C');
System.out.println("[INST]38;cIndex;s.indexOf('C');"+cIndex);
            int fIndex = s.lastIndexOf('F');
System.out.println("[INST]39;fIndex;s.lastIndexOf('F');"+fIndex);
            if (cIndex < 0 || fIndex < 0 || fIndex < cIndex) {
                out.println("No");
            } else {
                out.println("Yes");
            }
        }

    }
    static class FastInput {
        private final InputStream is;
        private StringBuilder defaultStringBuf = new StringBuilder(1 << 13);
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public String readString(StringBuilder builder) {
            skipBlank();

            while (next > 32) {
                builder.append((char) next);
System.out.println("[INST]85;None;builder.append((char) next);"+builder.append((char) next));
                next = read();
            }

            return builder.toString();
System.out.println("[INST]89;None;builder.toString();"+builder.toString());
        }

        public String readString() {
            defaultStringBuf.setLength(0);
System.out.println("[INST]93;None;defaultStringBuf.setLength(0);"+defaultStringBuf.setLength(0));
            return readString(defaultStringBuf);
        }

    }
    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(1 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput println(String c) {
            cache.append(c).append('\n');
System.out.println("[INST]111;None;cache.append(c).append('\n');"+cache.append(c).append('\n'));
System.out.println("[INST]111;None;cache.append(c);"+cache.append(c));
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
System.out.println("[INST]117;None;os.append(cache);"+os.append(cache));
                cache.setLength(0);
System.out.println("[INST]118;None;cache.setLength(0);"+cache.setLength(0));
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

    }
}

