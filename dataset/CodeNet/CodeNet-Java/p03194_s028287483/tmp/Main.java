import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
System.out.println("[INST]5;n;sc.nextLong();"+n);
        long p = sc.nextLong();
System.out.println("[INST]6;p;sc.nextLong();"+p);
        sc.close();
        if(n == 1){
            System.out.println(p);
            return;
        }

        long ans = 1;
        for(int i = 2; i < p ; i++){
            //if(p % i == 0){
                long t = (long)Math.pow(i,n);
System.out.println("[INST]16;None;Math.pow(i,n);"+Math.pow(i,n));
                if(p % t == 0){
                    ans = i;
                }
                if(t > p){
                    break;
                }                
            //}
        }
        System.out.println(ans);
    }
}