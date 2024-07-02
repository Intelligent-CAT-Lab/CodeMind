import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int MOD = 1000000007;

    public void go() throws IOException
    {
        StringTokenizer tok = new StringTokenizer(in.readLine());
System.out.println("[INST]12;None;in.readLine();"+in.readLine());
        long l = Long.parseLong(tok.nextToken());
System.out.println("[INST]13;l;Long.parseLong(tok.nextToken());"+l);
System.out.println("[INST]13;None;tok.nextToken();"+tok.nextToken());
        long r = Long.parseLong(tok.nextToken());
System.out.println("[INST]14;r;Long.parseLong(tok.nextToken());"+r);
System.out.println("[INST]14;None;tok.nextToken();"+tok.nextToken());
        int n = Long.toBinaryString(r).length();
System.out.println("[INST]15;n;Long.toBinaryString(r).length();"+n);
System.out.println("[INST]15;None;Long.toBinaryString(r);"+Long.toBinaryString(r));
        // bit position, x in range, y in range, msb flipped
        long[][][][] dp = new long[n+1][2][2][2];
        for (int x = 0; x < 2; x++)
        {
            for (int y = 0; y < 2; y++)
            {
                for (int msb = 0; msb < 2; msb++)
                {
                    dp[0][x][y][msb] = 1;
                    print(dp, 0, x, y, msb);
                }
            }
        }
        for (int i = 1; i <= n; i++)
        {
            for (int x = 0; x < 2; x++)
            {
                for (int y = 0; y < 2; y++)
                {
                    for (int msb = 0; msb < 2; msb++)
                    {
                        // flip neither, x needs to be in range
                        if (x == 1 || getBit(l, i-1) == 0)
                        {
                            // y is in range if already in range or current bit is 1
                            dp[i][x][y][msb] += dp[i-1][x][y | getBit(r, i-1)][msb];
                            dp[i][x][y][msb] %= MOD;
                        }
                        // flip both, y needs to be in range
                        if (y == 1 || getBit(r, i-1) == 1)
                        {
                            // msb gets flipped
                            // x is in range if already in range or current bit is 0
                            dp[i][x][y][msb] += dp[i-1][x | (1-getBit(l, i-1))][y][1];
                            dp[i][x][y][msb] %= MOD;
                        }
                        // flip only y, both need to be in range and msb needs to have been flipped
                        if ((x == 1 || getBit(l, i-1) == 0)
                            && (y == 1 || getBit(r, i-1) == 1)
                            && msb == 1)
                        {
                            dp[i][x][y][msb] += dp[i-1][x][y][1];
                            dp[i][x][y][msb] %= MOD;
                        }
                        print(dp, i, x, y, msb);
                    }
                }
            }
        }
        out.println(dp[n][0][0][0]);

        out.flush();
System.out.println("[INST]67;None;out.flush();"+out.flush());
        in.close();
    }

    public void print(long[][][][] dp, int i, int x, int y, int msb)
    {
        // out.printf("%d %d %d %d = %d%n", i, x, y, msb, dp[i][x][y][msb]);
    }

    public int getBit(long n, int i)
    {
        return (int)((n >> i) & 1);
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }
}
