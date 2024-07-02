import java.util.*;
import java.io.*;
public class Main extends PrintWriter {
    Main()
    {
        super(System.out);
    }
    public static void main(String args[]) {
      Main o=new Main();
      o.main();
      o.flush();
System.out.println("[INST]10;None;o.flush();"+o.flush());
      o.close();
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        long x=Math.abs(sc.nextLong());
System.out.println("[INST]16;x;Math.abs(sc.nextLong());"+x);
System.out.println("[INST]16;None;sc.nextLong();"+sc.nextLong());
        long k=sc.nextLong();
System.out.println("[INST]17;k;sc.nextLong();"+k);
        long d=sc.nextLong();
System.out.println("[INST]18;d;sc.nextLong();"+d);
        long rem=x%d;
        long quo=x/d;
        if(k<quo)
        {
            println(Math.abs(x-(k*d)));
System.out.println("[INST]23;None;println(Math.abs(x-(k*d)));"+println(Math.abs(x-(k*d))));
System.out.println("[INST]23;None;Math.abs(x-(k*d));"+Math.abs(x-(k*d)));
        }
        else
        {
          		long v1=rem-d;
                long rem1=k-quo;
                if(rem1%2==0)
                println(Math.abs(rem));
System.out.println("[INST]30;None;println(Math.abs(rem));"+println(Math.abs(rem)));
System.out.println("[INST]30;None;Math.abs(rem);"+Math.abs(rem));
                else
                println(Math.abs(v1));
System.out.println("[INST]32;None;println(Math.abs(v1));"+println(Math.abs(v1)));
System.out.println("[INST]32;None;Math.abs(v1);"+Math.abs(v1));
         }
        sc.close();
    }
}
