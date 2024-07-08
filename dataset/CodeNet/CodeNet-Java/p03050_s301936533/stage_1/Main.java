import java.io.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        long N = Long.parseLong(str);
        ArrayList<Long> num = new ArrayList<>();
var newVariable_0 = Math.sqrt(N);        for (int i=1;i<newVariable_0;i++){
            if ((N-i)%i==0 && (N-i)/i>i){
var newVariable_1 = num.add((long)(N-i)/i);            }
        }
        long ans = 0;
        for (long n:num){
            ans += n;
        }
        System.out.println(ans);
    }
}