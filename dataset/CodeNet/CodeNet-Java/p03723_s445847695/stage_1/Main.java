import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a==b && b==c && a%2==0){
            System.out.println(-1);
            return;
        }
        
        for(int i=0; i<1_000_000_000; i++){
            if(a%2==1 || b%2==1 || c%2==1){
                System.out.println(i);
                return;
            }
            int ah = a/2;
            int bh = b/2;
            int ch = c/2;
            a = bh+ch;
            b = ah+ch;
            c = ah+bh;
        }
    }
}
