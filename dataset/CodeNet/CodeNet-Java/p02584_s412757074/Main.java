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
      o.close();
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        long x=Math.abs(sc.nextLong());
        long k=sc.nextLong();
        long d=sc.nextLong();
        long rem=x%d;
        long quo=x/d;
        if(k<quo)
        {
            println(Math.abs(x-(k*d)));
        }
        else
        {
          		long v1=rem-d;
                long rem1=k-quo;
                if(rem1%2==0)
                println(Math.abs(rem));
                else
                println(Math.abs(v1));
         }
        sc.close();
    }
}
