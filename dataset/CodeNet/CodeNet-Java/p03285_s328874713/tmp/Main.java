import java.io.*;
class Program{
    boolean fact(int n){
        int count = 0;
        for(int i=1;i<=Math.sqrt(n);i++){
System.out.println("[INST]4;None;Math.sqrt(n);"+Math.sqrt(n));
            if (n%i==0){
                if (i!=Math.sqrt(n)) count+=2;
System.out.println("[INST]6;None;Math.sqrt(n);"+Math.sqrt(n));
                else{
                    if (Math.pow(Math.sqrt(n),2)==n) count+=1;
System.out.println("[INST]8;None;Math.pow(Math.sqrt(n),2);"+Math.pow(Math.sqrt(n),2));
System.out.println("[INST]8;None;Math.sqrt(n);"+Math.sqrt(n));
                    else count+=2;
                }
            }
        }
        if (count==8) return true;
        else return false;
    }
}
class Main{
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Program obj = new Program();
        boolean flag = false;int N = Integer.parseInt(in.readLine());
System.out.println("[INST]21;N;Integer.parseInt(in.readLine());"+N);
System.out.println("[INST]21;None;in.readLine();"+in.readLine());
        if (N%4==0||N%7==0) flag = true;
        else{
            for(int i =4;i<N;i+=4){
                if ( (N-i)%7==0 ){
                    flag = true; break;
                }
            }
        }
        if (flag) System.out.println("Yes");
        else System.out.println("No");
    }
}