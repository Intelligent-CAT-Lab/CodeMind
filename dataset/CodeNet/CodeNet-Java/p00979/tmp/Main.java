public class Main
{
    
    public static long low = 1, high = (long)Math.pow(3, 32), n;
System.out.println("[INST]3;None;Math.pow(3, 32);"+Math.pow(3, 32));
    
    public static void main(String[] args)
    {
        n = new java.util.Scanner(System.in).nextLong();
System.out.println("[INST]7;n;new java.util.Scanner(System.in).nextLong();"+n);
        long ans = (n == 0) ? -1 : dfs(1, 1);
        System.out.println(ans + 1);
    }
    
    public static long dfs(long pos, long pace)
    {
        if(pos > n) return 0;
        // 3.0X
        if(pace < high)
        {
            long npace = 3 * pace;
            long npos = pos + npace;
            if(npos == n & (npace == 1 | npace == 3)) return 1;
            else
            {
//                if(npos > n) return 0;
                long temp = dfs(npos, npace);
                if (temp != 0) return 1 + temp;
            }
        }
        
        // 1.0X
        {
            long npace = pace;
            long npos = npace + pos;
            if(npos == n & (npace == 1 | npace == 3)) return 1;
            else
            {
//                if(npos > n) return 0;
                long temp = dfs(npos, npace);
                if (temp != 0) return 1 + temp;
            }
        }
        
        // 0.3X
        if(pace > low)
        {
            long npace = pace / 3;
            long npos = pos + npace;
            if(npos == n & (npace == 3 | npace == 1)) return 1;
            else
            {
//                if(npos > n) return 0;
                long temp = dfs(npos, npace);
                if(temp != 0) return 1 + temp;
            }
        }
        return 0;
    }
    
}
