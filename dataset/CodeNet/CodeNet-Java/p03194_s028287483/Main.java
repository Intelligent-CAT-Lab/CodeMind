import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        sc.close();
        if(n == 1){
            System.out.println(p);
            return;
        }

        long ans = 1;
        for(int i = 2; i < p ; i++){
            //if(p % i == 0){
                long t = (long)Math.pow(i,n);
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