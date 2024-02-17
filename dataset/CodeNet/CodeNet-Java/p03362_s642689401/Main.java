
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Prime prime = new Prime();

        int count = 0;

        while (true){
            int num = prime.nextPrime();
            if(num % 5 == 1){
                count++;
                System.out.print(num);

                if(n == count){
                    break;
                }

                System.out.print(" ");
            }
        }

    }

    static class Prime {
        int last;
        List<Integer> primes = new ArrayList<>();

        Prime(){
            primes.add(2);
            primes.add(3);
            last = 3;
        }

        public boolean isPrime(int x) {
            for (int i = 2; i * i <= x; i ++) {
                if (x % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public void createPrimeList(int x) {
            for (int i = 0; i < x; i++) {
                nextPrime();
             }
        }

        public int nextPrime(){
            int i = last + 2;
            while(true){
                if(isPrime(i)){
                    primes.add(i);
                    last = i;
                    return i;
                }
                i += 2;
            }
        }
    }
}