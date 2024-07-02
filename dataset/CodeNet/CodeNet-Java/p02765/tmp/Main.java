import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
System.out.println("[INST]6;n;sc.nextInt();"+n);
        int r = sc.nextInt();
System.out.println("[INST]7;r;sc.nextInt();"+r);
        if(n < 10){
            System.out.println(r+ (10 - n) * 100);
        
        }else{
            System.out.println(r);
        }
    }
}
