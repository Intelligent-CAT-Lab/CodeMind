class main:
    import java.io.IOException;
    import java.io.InputStream;
    import java.util.*;
    
    public class p02335 implements Runnable {
    
        public static void main(String[] args) {
            new Thread(null, new p02335(), "", 16 * 1024 * 1024).start();
        }
    
        public void run() {
            FastScanner sc = new FastScanner();
    
            int n = sc.nextInt();
            int k = sc.nextInt();
    
            Combinatrics c = new Combinatrics(k);
    
            System.out.println(c.combination(k, n));
        }
    }