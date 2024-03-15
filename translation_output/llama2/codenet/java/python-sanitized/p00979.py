> Translate the following java code to python and enclose your solution inside :

public class p00979
{
    
    public static long low = 1, high = (long)Math.pow(3, 32), n;
    
    public static void main(String[] args)
    {
        n = new java.util.Scanner(System.in).nextLong();
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
        
        //