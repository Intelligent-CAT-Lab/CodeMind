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
var newVariable_0 = o.flush();      o.close();
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
var newVariable_1 = sc.nextLong();        long x=Math.abs(newVariable_1);
        long k=sc.nextLong();
        long d=sc.nextLong();
        long rem=x%d;
        long quo=x/d;
        if(k<quo)
        {
var newVariable_2 = Math.abs(x-(k*d));            println(newVariable_2);
        }
        else
        {
          		long v1=rem-d;
                long rem1=k-quo;
                if(rem1%2==0)
var newVariable_3 = Math.abs(rem);                println(newVariable_3);
                else
var newVariable_4 = Math.abs(v1);                println(newVariable_4);
         }
        sc.close();
    }
}
