

import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 3137
 *  2020/5/3
 */
public class Main {


    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int sum = a+b+c+d;

        int s1 = Math.abs(sum - (a+b)*2);
        int s2 = Math.abs(sum-(a+c)*2);
        int s3 = Math.abs(sum-(a+d)*2);
        int min = Math.min(s1, Math.min(s2, s3));


        System.out.printf("%d\n", min);

        sc.close();
        return false;
    }



    PrintStream log;
    PrintStream result = System.out;
    BufferedReader systemin;

    static Main instance = new Main();

    Main() {
        systemin = new BufferedReader(new InputStreamReader(System.in));
        log = new PrintStream(new OutputStream() { public void write(int b) {} } );
    }

    public static void main(String[] args) throws IOException {

        instance.main();

        instance.systemin.close();
    }


}


