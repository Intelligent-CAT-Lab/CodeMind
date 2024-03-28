class main:
    import java.io.OutputStream;
    import java.io.IOException;
    import java.io.InputStream;
    import java.io.OutputStream;
    import java.io.IOException;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.io.BufferedOutputStream;
    import java.io.UncheckedIOException;
    import java.util.List;
    import java.nio.charset.Charset;
    import java.util.StringTokenizer;
    import java.io.Writer;
    import java.io.OutputStreamWriter;
    import java.io.BufferedReader;
    import java.io.InputStream;
    
    /**
     * Built using CHelper plug-in
     * Actual solution is at the top
     *
     * @author mikit
     */
    public class p02635 {
        public static void main(String[] args) {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            LightScanner in = new LightScanner(inputStream);
            LightWriter out = new LightWriter(outputStream);
            CShift solver = new CShift();
            solver.solve(1,