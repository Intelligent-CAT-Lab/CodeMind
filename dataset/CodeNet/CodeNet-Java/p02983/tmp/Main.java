import java.io.*;
import java.util.*;

class FastReader 
{ 
    BufferedReader br; 
    StringTokenizer st; 
    
    public FastReader() 
    { 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 
    
    String next() 
    { 
        while (st == null || !st.hasMoreElements()) 
System.out.println("[INST]15;None;st.hasMoreElements();"+st.hasMoreElements());
        { 
            try
            { 
                st = new StringTokenizer(br.readLine()); 
System.out.println("[INST]19;None;br.readLine();"+br.readLine());
            } 
            catch (IOException  e) 
            { 
                e.printStackTrace(); 
            } 
        } 
        return st.nextToken(); 
System.out.println("[INST]26;None;st.nextToken();"+st.nextToken());
    } 
    
    int nextInt() 
    { 
        return Integer.parseInt(next()); 
    } 
    
    long nextLong() 
    { 
        return Long.parseLong(next()); 
    } 
    
    double nextDouble() 
    { 
        return Double.parseDouble(next()); 
    } 
    
    String nextLine() 
    { 
          String str = ""; 
        try
        { 
            str = br.readLine(); 
System.out.println("[INST]49;str;br.readLine();"+str);
        } 
        catch (IOException e) 
        { 
            e.printStackTrace(); 
        } 
        return str; 
    } 
} 

class Solution
{
    void solve()
    {
        FastReader sc = new FastReader();
        
        int L = sc.nextInt();
        int R = sc.nextInt();

        R -= L;
        L %= 2019;
        R += L;

        int res = 2019; //max value

        if(R - L > 2019)
        {
            System.out.println(0);
            return;
        }

        for(int i = L; i <= R; i++)
        {
            for(int j = L; j < i ; j++)
            {
                res = Math.min(res, (i*j) % 2019);
System.out.println("[INST]84;res;Math.min(res, (i*j) % 2019);"+res);
            }
        }

        System.out.println(res);
    }
}
  
public class Main 
{ 
    public static void main(String[] args) 
    { 
        Solution ob = new Solution();

        ob.solve();
    } 
} 