import java.util.*;
public class p03320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int a = 0;
        int d = 1;
        int snuke(int x){
            int a = 0;
            while(x>0){
                a += x%10;
                x /= 10;
            }
            return a;
        }
        for(int i = 1; i <= K; i++){
            int x = a + d;
            int y = a + 10*d;
            if(x/snuke(x) <= y/snuke(y)){
                a = x;
            }else{
                a = y;
                d *= 10;
            }
            System.out.println(a);
        }
    }
}