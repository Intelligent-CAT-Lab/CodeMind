
import java.util.*;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        int count = 1;

        //AとBの最大公約数を求める
        long gcdAB = Main.gcd(A, B);

        //最大公約数を、「素数 or 1」になるまで素因数分解
        //新しい素数で割れた時にcountを増やす
        for(long i = 2 ; i <= Math.sqrt(gcdAB); i++){
            //自身の平方根より小さい数字で割り切れない場合、その数は素数である
            if(gcdAB % i == 0) count++;
            while(gcdAB % i == 0){
                gcdAB /= i;
            }
        }
        //gcdABが「素数 or 1」になっているので、素数の場合はcountを増やす
        if(gcdAB > 1) count++;

        System.out.println(count);

    }

    //gcd  = greateset common divisor
    public static long gcd(long A, long B){
        if(B == 0) return A;
        else return gcd(B, A % B);
    }




}





