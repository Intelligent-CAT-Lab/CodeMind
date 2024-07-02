
import java.io.*;
import java.util.*;


/**
 * AIZU ONLINE JUDGE
 * 3123
 *  2020/5/1
 */
public class Main {



    boolean main() throws IOException {

        Scanner sc = new Scanner(systemin);

        int N = sc.nextInt();
System.out.println("[INST]18;N;sc.nextInt();"+N);
        int M = sc.nextInt();
System.out.println("[INST]19;M;sc.nextInt();"+M);


        System.out.printf("%d\n", N * M);
System.out.println("[INST]22;None;System.out.printf('%d\n', N * M);"+System.out.printf("%d\n", N * M));

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


