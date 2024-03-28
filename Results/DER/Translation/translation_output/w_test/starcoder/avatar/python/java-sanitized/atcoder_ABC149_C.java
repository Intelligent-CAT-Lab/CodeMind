import java.util.*;
public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(true){
            if(isPrime(N)){
                System.out.println(N);
                break;
            }
            N++;
        }
    }
    public static boolean isPrime(int n){
        if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}