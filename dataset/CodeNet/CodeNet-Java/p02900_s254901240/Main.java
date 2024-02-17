import java.util.*;

class Main{
    static long gcd(long a, long b){
        return b == 0 ? a : gcd(b,a % b); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        long g = gcd(A, B);
        int count = 1;
        for(long i = 2; i*i <= g; i++){
            if(g % i == 0){
                count++;
                while(g % i == 0){
                    g /= i;
                }
            } 
        }
        if(g > 1) count++;

        System.out.println(count);
    }
}