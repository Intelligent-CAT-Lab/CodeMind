class main:
    import java.io.InputStream;
    import java.io.OutputStream;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.io.BufferedReader;
    import java.io.OutputStreamWriter;
    import java.io.PrintWriter;
    import java.util.Arrays;
    import java.util.StringTokenizer;
    
    public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
            TaskAdapter task = new TaskAdapter();
            task.run();
            br.close();
            pw.close();
        }
    }
    
    class TaskAdapter implements Runnable {
        public void run() {
            FastInput in = new FastInput(System.in);
            FastOutput out = new FastOutput(System.out);
            FDISCOSMOS solver = new FDISCOSMOS();
            solver.solve(1, in, out);
            out.close();
        }
    }
    
    class FDISCOSMOS {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int h = in.readInt();
            int w = in.readInt();
            int t = in.readInt();
    
            int hh = h / GCDs.gcd(h, t);
            int w