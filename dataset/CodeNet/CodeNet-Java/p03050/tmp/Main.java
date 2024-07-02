import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
System.out.println("[INST]9;n;Long.parseLong(br.readLine());"+n);
System.out.println("[INST]9;None;br.readLine();"+br.readLine());
        long ans = 0;
        for(int i = 1; i <= Math.sqrt(n); i++) {
System.out.println("[INST]11;None;Math.sqrt(n);"+Math.sqrt(n));
           if(n % i == 0) {
               long m = n / i - 1;
               if(i < m) ans += m;
           }
        }

        System.out.println(ans);
        
        br.close();
    }
}