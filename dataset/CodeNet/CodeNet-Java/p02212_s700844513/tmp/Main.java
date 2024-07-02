

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
System.out.println("[INST]18;a;sc.nextInt();"+a);
        int b = sc.nextInt();
System.out.println("[INST]19;b;sc.nextInt();"+b);
        int c = sc.nextInt();
System.out.println("[INST]20;c;sc.nextInt();"+c);
        int d = sc.nextInt();
System.out.println("[INST]21;d;sc.nextInt();"+d);

        int sum = a+b+c+d;

        int s1 = Math.abs(sum - (a+b)*2);
System.out.println("[INST]25;s1;Math.abs(sum - (a+b)*2);"+s1);
        int s2 = Math.abs(sum-(a+c)*2);
System.out.println("[INST]26;s2;Math.abs(sum-(a+c)*2);"+s2);
        int s3 = Math.abs(sum-(a+d)*2);
System.out.println("[INST]27;s3;Math.abs(sum-(a+d)*2);"+s3);
        int min = Math.min(s1, Math.min(s2, s3));
System.out.println("[INST]28;min;Math.min(s1, Math.min(s2, s3));"+min);
System.out.println("[INST]28;None;Math.min(s2, s3);"+Math.min(s2, s3));


        System.out.printf("%d\n", min);
System.out.println("[INST]31;None;System.out.printf('%d\n', min);"+System.out.printf("%d\n", min));

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


