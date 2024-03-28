import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class p02342 implements Runnable {

    public static void main(String[] args) {
        new Thread(null, new p02342(), "", 16 * 1024 * 1024).start();
    }

    public void run() {
        FastScanner sc = new FastScanner();

        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(partition(n - k, k));

    }

    //åå²æ°ãdpã§æ±ãã
    //nãkåã®éè² æ´æ°ã®åã§è¡¨ãï¼âkåä»¥ä¸ã®èªç¶æ°ã®åã§è¡¨ãï¼å