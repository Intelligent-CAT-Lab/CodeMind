//package javaapplication2;
import java.util.*;
import java.io.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("\\s");
System.out.println("[INST]8;s;br.readLine().split('\\s');"+s);
System.out.println("[INST]8;None;br.readLine();"+br.readLine());
        int A = Integer.parseInt(s[0]);
System.out.println("[INST]9;A;Integer.parseInt(s[0]);"+A);
        int B = Integer.parseInt(s[1]);
System.out.println("[INST]10;B;Integer.parseInt(s[1]);"+B);
        System.out.println(solve(A,B));
    }
    
    private static int solve(int A,int B){
        int low = 1,high = Integer.MAX_VALUE;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int p8 = consumptionRate(mid,8);
            int p10 = consumptionRate(mid,10);
            if(p8 == A && p10 == B){
                ans = mid;
                high = mid - 1;
            }else if(p8 <= A && p10 <= B) low = mid + 1;
            else high = mid - 1;
        }
        return ans;
    }
    
    private static int consumptionRate(long p,int percent){
        return (int)Math.floor(p * percent / 100.0);
System.out.println("[INST]31;None;Math.floor(p * percent / 100.0);"+Math.floor(p * percent / 100.0));
    }
}
