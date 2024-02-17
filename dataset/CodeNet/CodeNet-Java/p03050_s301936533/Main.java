import java.io.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        long N = Long.parseLong(str);
        ArrayList<Long> num = new ArrayList<>();
        for (int i=1;i<Math.sqrt(N);i++){
            if ((N-i)%i==0 && (N-i)/i>i){
                num.add((long)(N-i)/i);
            }
        }
        long ans = 0;
        for (long n:num){
            ans += n;
        }
        System.out.println(ans);
    }
}