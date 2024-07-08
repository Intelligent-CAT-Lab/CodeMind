import java.util.*;

public class Main {

    public static void main(String[] args) {
        //
        Euclid e1=new Euclid();//ユークリッドの互除法
        Compute c1=new Compute();//累積和，
        //変数
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

        //入力
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
        //出力
        //BigDecimal bd = new BigDecimal(answer);
        //System.out.println(bd.setScale(12,BigDecimal.ROUND_DOWN));
        //System.out.println(String.format("%.0f",answer));
        System.out.println(answer);
    }
}

class Euclid
{
    public static int gcd(int x,int y)//ユークリッドの互除法を使って2値の最大公約数を求める(int)
    {
        int tmp;
        if(x<y)
        {
            tmp=x;
            x=y;
            y=tmp;
        }
        if(x==0)//(x or y)=0の時は0でない時の値を返す
        {
            return y;
        }else if(y==0)
        {
            return x;
        }else
        {
            while ((tmp = x % y) != 0)
            {
                x = y;
                y = tmp;
            }
            return y;
        }
    }

    public static long gcd(long x,long y)//ユークリッドの互除法を使って2値の最大公約数を求める(long)
    {
        long tmp;
        if(x<y)
        {
            tmp=x;
            x=y;
            y=tmp;
        }
        if(x==0)//(x or y)=0の時は0でない時の値を返す
        {
            return y;
        }else if(y==0)
        {
            return x;
        }else
        {
            while ((tmp = x % y) != 0)
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
    int cumulativeSum(int A[],int k)//kの大きさごとに配列Aを切り取ってその区間内の数を足した時の最大値をreturn
    {
        int ans=0;
        //累積和表を作成
        int B[]=new int[A.length+1];//累積和に使う配列
        B[0]=0;
        for(int i=1;i<B.length;i++)
        {
            B[i]=B[i-1]+A[i-1];
        }

        //最大値を求める
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

    public int leastCommonMultiple(int a,int b)//最大公倍数(Euclidクラスが必要)(int)
    {
        int ans=1;
        Euclid e1=new Euclid();
        
        ans=(a*b)/e1.gcd(a,b);

        return ans;
    }

    public long leastCommonMultiple(long a,long b)////最大公倍数(Euclidクラスが必要)(long)
    {
        long ans=1;
        Euclid e1=new Euclid();

        ans=(a*b)/e1.gcd(a,b);

        return ans;
    }
}