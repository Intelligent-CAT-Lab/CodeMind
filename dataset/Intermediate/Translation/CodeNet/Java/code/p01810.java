import java.util.*;

public class p01810{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        long N = sc.nextLong(), K = sc.nextLong();
                        long ans = 0;
                        for(long i = 0; i < N - 1; i++){
                                ans = K * ((long)(ans / (K - 1))) + ans % (K - 1) + 1;
                        }
                        System.out.println(ans);
                }
        }
}