import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

var newVariable_0 = br.readLine();        long n = Long.parseLong(newVariable_0);
        long ans = 0;
var newVariable_1 = Math.sqrt(n);        for(int i = 1; i <= newVariable_1; i++) {
           if(n % i == 0) {
               long m = n / i - 1;
               if(i < m) ans += m;
           }
        }

        System.out.println(ans);
        
        br.close();
    }
}