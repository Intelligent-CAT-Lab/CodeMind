> Translate the following java code to python and enclose your solution inside :

import java.util.*;

public class p02995 {

    public static void main(String[] args) {
        //
        Euclid e1=new Euclid();//ã¦ã¼ã¯ãªããã®äºé¤æ³
        Compute c1=new Compute();//ç´¯ç©åï¼
        //å¤æ°
        int count = 0;
        boolean sw = false;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        double dMax = Double.MIN_VALUE;
        double dMin = Double.MAX_VALUE;
        //int answer = 0;
        long answer=0;
        //String answer="Good";
        //StringBuilder answer=new StringBuilder();
        //List<Integer> list = new ArrayList<>();
        //int array[] = new int[];

        //å
¥å
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        long n = B-A+1;

        if(C==D)
        {
            long a=A/C;
            long b=B/C;
            long x=b-a;
            if (A%C==0) {x++;}
            answer=n-x;
            System.out.println(answer);
            return;
        }

        long a=A/C;
        long b=B/C;
        long p=b-a;
        if (A%C==0){p++;}

        a=A/D;
        b=B/D;
        long q=b-a;
        if (A%D==0){q++;}

        long e=c