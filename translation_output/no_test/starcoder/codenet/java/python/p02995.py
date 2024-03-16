<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
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

        //å¥å
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

        long e=c1.leastCommonMultiple(C,D);
        a=A/e;
        b=B/e;
        long r=b-a;
        if(A%e==0){r++;}

        answer=n-(p+q-r);
        //åºå
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        System.out.println(answer);
    }
}

class Euclid
{
    public static int gcd(int x,int y)//ã¦ã¼ã¯ãªããã®äºé¤æ³ãä½¿ã£ã¦2å¤ã®æå¤§å¬ç´æ°ãæ±ãã(int)
    {
        int tmp;
        if(x<y)
        {
            tmp=x;
            x=y;
            y=tmp;
        }
        if(x==0)//(x or y)=0ã®æã¯0ã§ãªãæã®å¤ãè¿ã
        {
            return y;
        }else if(y==0)
        {
            return x;
        }else
        {
            while ((tmp = x % y)!= 0)
            {
                x = y;
                y = tmp;
            }
            return y;
        }
    }

    public static long gcd(long x,long y)//ã¦ã¼ã¯ãªããã®äºé¤æ³ãä½¿ã£ã¦2å¤ã®æå¤§å¬ç´æ°ãæ±ãã(long)
    {
        long tmp;
        if(x<y)
        {
            tmp=x;
            x=y;
            y=tmp;
        }
        if(x==0)//(x or y)=0ã®æã¯0ã§ãªãæã®å¤ãè¿ã
        {
            return y;
        }else if(y==0)
        {
            return x;
        }else
        {
            while ((tmp = x % y)!= 0)
            {
                x = y;
                y = tmp;
            }
            return y;
        }
    }
}

class Compute
{
    int cumulativeSum(int A[],int k)//kã®å¤§ãããã¨ã«éåAãåãåã£ã¦ãã®åºéåã®æ°ãè¶³ããæã®æå¤§å¤ãreturn
    {
        int ans=0;
        //ç´¯ç©åè¡¨ãä½æ
        int B[]=new int[A.length+1];//ç´¯ç©åã«ä½¿ãéå
        B[0]=0;
        for(int i=1;i<B.length;i++)
        {
            B[i]=B[i-1]+A[i-1];
        }

        //æå¤§å¤ãæ±ãã
        int tmp=0;
        ans=B[k]-B[0];
        for(int i=1;i<A.length-k;i++)
        {
            tmp=B[i+k]-B[i];
            if(tmp>ans)
            {
                ans=tmp;
            }
        }
        System.out.println(Arrays.toString(B));
        return ans;
    }

    public int leastCommonMultiple(int a,int b)//æå¤§å¬åæ°(Euclidã¯ã©ã¹ãå¿è¦)(int)
    {
        int ans=1;
        Euclid e1=new Euclid();
        
        ans=(a*b)/e1.gcd(a,b);

        return ans;
    }

    public long leastCommonMultiple(long a,long b)////æå¤§å¬åæ°(Euclidã¯ã©ã¹ãå¿è¦)(long)
    {
        long ans=1;
        Euclid e1=new Euclid();

        ans=(a*b)/e1.gcd(a,b);

        return ans;
    }
}
```

python code:<fim_suffix><fim_middle>
```python
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
        int min = Integer.MAX
