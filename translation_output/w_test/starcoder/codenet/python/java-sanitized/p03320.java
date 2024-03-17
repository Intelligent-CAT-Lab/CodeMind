import java.util.*;
public class p03320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int a = 0;
        int d = 1;
        while(K>0){
            a += K%10;
            K /= 10;
        }
        while(true){
            int x = a + d;
            int y = a + 10*d;
            if(x/snuke(x) <= y/snuke(y)){
                a = x;
            }else{
                a = y;
                d *= 10;
            }
            System.out.println(a);
            if(a == 19) break;
        }
    }
    public static int snuke(int x){
        int a = 0;
        while(x>0){
            a += x%10;
            x /= 10;
        }
        return a;
    }
}