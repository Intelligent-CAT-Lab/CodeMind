import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class p02336 implements Runnable {

    public static void main(String[] args) {
        new Thread(null, new p02336(), "", 16 * 1024 * 1024).start();
    }

    public void run() {
        FastScanner sc = new FastScanner();

        int n = sc.nextInt();
        int k = sc.nextInt();

        Combinatrics c = new Combinatrics(n - 1);

        System.out.println(c.homogeneous(k, n - k));

    }
}


class Combinatrics {