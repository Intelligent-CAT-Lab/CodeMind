import java.math.*;
import java.util.*;
import java.io.*;
  
public class Main { 
  
    static BufferedReader in;
    static PrintWriter out = new PrintWriter(System.out);
    static String file = "../in";
    static int test = 10; // 0 for local testing, 1 for std input
    static int inf = 1_000_000, mod = 1_000_000_007;



    void swap(int[]ary, int i, int j)
    {
        int t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }
    
    String[] split() throws Exception
    {
        return in.readLine().split(" ");
    }

    int readInt() throws Exception
    {
        return Integer.valueOf(in.readLine());
    }

    long readLong() throws Exception
    {
        return Long.valueOf(in.readLine());
    }

    long[] toLongArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        long[] ary = new long[n];
        for(int i = 0; i < n; i++) ary[i] = Long.valueOf(sp[i]);
        return ary;
    }

    int[] toIntArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        int[] ary = new int[n];
        for(int i = 0; i < n; i++) ary[i] = Integer.valueOf(sp[i]);
        return ary;
    }

    String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }


    long pow(long a, int pow)
    {
        long res = 1;
        while(pow > 0)
        {
            if(pow % 2 != 0) {
                res *= a;
                res %= mod;
            }
            a = a * a;
            a %= mod;
            pow /= 2;
        }

        return res;
    }

    public static void main(String[] args) throws Exception
    {
        int _k = Integer.valueOf("1");
        if(test > 0) in = new BufferedReader(new InputStreamReader(System.in));
        else in = new BufferedReader(new FileReader(file));
        if(test < 0) {String[] str = in.readLine().split(" ");
        char[] gg = in.readLine().toCharArray();}
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
        // System.out.println((-100 + 0) / 2);

        // char[] c = new char[4];
        // c[1] = '.';
        // for(char i = '0'; i <= '9'; i++)
        // {
        //     for(char j = '0'; j <= '9'; j++)
        //     {
        //         for(char k = '0'; k <= '9'; k++)
        //         {
        //             c[0] = i;
        //             c[2] = j;
        //             c[3] = k;
        //             double d = Double.valueOf(String.valueOf(c));
        //             int v = (int)(d * 100);
        //             String s1 = String.valueOf("" + c[0] + c[2] + c[3]),
        //                 s2 = String.valueOf(v);
        //             System.out.printf("%s %s %b\n", s1, s2, s1.equals(s2));
        //         }
        //     }
        // }


        new Main().a();
        out.flush();
    }
    void f() throws Exception
    {
        int k = readInt();
        String s = in.readLine();
        int n = s.length();
        long prod = 1;
        int mod = 1_000_000_007;
        for(int i = 0; i < k; i++)
        {
            n++;
            prod = (prod * 26 * n) % mod;
        }
        System.out.println(prod);

    }

    void e() throws Exception
    {

    }

    void d() throws Exception
    {
        int n = readInt();
        int[] ary = toIntArray();
        Arrays.sort(ary);
        int sum = ary[n - 1];
        Queue<int[]> q = new PriorityQueue<>((a, b)->(b[0] - a[0]));
        q.offer(new int[]{Math.min(ary[n - 2], ary[n - 1]), ary[n - 2], ary[n - 1]});
        q.offer(new int[]{Math.min(ary[n - 2], ary[n - 1]), ary[n - 2], ary[n - 1]});
        for(int i = n - 3; i >= 0; i--)
        {
            // for(int[] next : q)
            //     System.out.println(Arrays.toString(next));
            // System.out.println(sum);
            // System.out.println("...");

            int[] cur = q.poll();
            sum += cur[0];
            int left = cur[1], right = cur[2];
            q.offer(new int[]{Math.min(ary[i], left), ary[i], left});
            q.offer(new int[]{Math.min(ary[i], right), ary[i], right});
        }
        out.println(sum);
    }

    void c() throws Exception
    {
        int[] ary = toIntArray();
        int h = ary[0], w = ary[1], k = ary[2];
        char[][] grid = new char[h][w];
        for(int i = 0; i < h; i++)
        {
            grid[i] = in.readLine().toCharArray();
        }
        int ans = 0;

        for(int i = 0; i < 1 << h; i++)
        {
            for(int j = 0; j < 1 << w; j++)
            {
                int count = 0;
                for(int row = 0; row < h; row++)
                {
                    if((i & (1 << row)) == 0) continue;
                    for(int col = 0; col < w; col++)
                    {
                        if((j & (1 << col)) == 0) continue;
                        count += grid[row][col] == '#' ? 1 : 0;
                    }   
                }
                if(count == k) ans++;
            }
        }

        out.println(ans);
    }

    int gcd(int a, int b)
    {
        if(b == 0) return a;
         return gcd(b, a % b);
    }

    void b() throws Exception
    {
        int n = readInt();
        int AC = 0, WA = 0, TLE = 0, RE = 0;
        while(n-- > 0)
        {
            String str = in.readLine();
            if(str.equals("AC")) AC++;
            if(str.equals("WA")) WA++;
            if(str.equals("TLE")) TLE++;
            if(str.equals("RE")) RE++;
        }
        out.printf("AC x %d\n", AC);
        out.printf("WA x %d\n", WA);
        out.printf("TLE x %d\n", TLE);
        out.printf("RE x %d\n", RE);

    }

    void a() throws Exception
    {
        int a = readInt();
        int[] kyu = {599,799,999,1199,1399,1599,1799,1999};
        for(int i = 0; i < 8; i++)
        {
            if(a <= kyu[i])
            {
                out.println(8 - i);
                return;
            }
        }
    }
}