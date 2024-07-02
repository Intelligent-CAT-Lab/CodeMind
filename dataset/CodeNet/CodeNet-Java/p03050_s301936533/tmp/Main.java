import java.io.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
System.out.println("[INST]6;str;br.readLine();"+str);
        long N = Long.parseLong(str);
System.out.println("[INST]7;N;Long.parseLong(str);"+N);
        ArrayList<Long> num = new ArrayList<>();
        for (int i=1;i<Math.sqrt(N);i++){
System.out.println("[INST]9;None;Math.sqrt(N);"+Math.sqrt(N));
            if ((N-i)%i==0 && (N-i)/i>i){
                num.add((long)(N-i)/i);
System.out.println("[INST]11;None;num.add((long)(N-i)/i);"+num.add((long)(N-i)/i));
            }
        }
        long ans = 0;
        for (long n:num){
            ans += n;
        }
        System.out.println(ans);
    }
}